package com.xworkz.grocery.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.grocery.entity.GroceryEntity;

@Repository
public class GroceryRepositoryImpl implements GroceryRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	public GroceryRepositoryImpl() {
		System.out.println("invoked groceryrepo");
	}
	
	@Override
	public void save(GroceryEntity groceryEntity) {
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
	
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(groceryEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}	
	}
	
	@Override
	public GroceryEntity findByName(String name) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			Object result = query.getSingleResult();
			return (GroceryEntity) result;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
		return GroceryRepository.super.findByName(name);
	}

}
