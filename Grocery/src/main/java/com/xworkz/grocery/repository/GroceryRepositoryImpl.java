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
			entityManager.getTransaction().begin();
			Query query = entityManager.createNamedQuery("findByName");
			query.setParameter("nam", name);
			Object result = query.getSingleResult();
			entityManager.getTransaction().commit();
			return (GroceryEntity) result;
		} catch (PersistenceException e) {
			entityManager.getTransaction().rollback();;
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		
		return GroceryRepository.super.findByName(name);
	}
	 

@Override
public GroceryEntity updateByName(GroceryEntity groceryEntity) {
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	try {
		entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("updateByName");
		query.setParameter("name", groceryEntity.getName());
		query.setParameter("quantity", groceryEntity.getQuantity());
		query.setParameter("price", groceryEntity.getPrice());
		query.setParameter("type", groceryEntity.getType());
		query.setParameter("brand", groceryEntity.getBrand());
		
		Object update=query.executeUpdate();	
		entityManager.getTransaction().commit();
		
	} 
	catch (PersistenceException e) {
		entityManager.getTransaction().rollback();;
		e.printStackTrace();
	}
	finally {
		entityManager.close();
	}
	
	return GroceryRepository.super.updateByName(groceryEntity);
}
}
