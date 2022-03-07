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
			e.printStackTrace();
		}
		
		return GroceryRepository.super.findByName(name);
	}
	 
@Override
public GroceryEntity updateByName(String name, int quantity, double price, String type, String brand) {
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	try {
		Query query = entityManager.createNamedQuery("updateByName");
		query.setParameter("name", name);
		query.setParameter("quantity", quantity);
		query.setParameter("price", price);
		query.setParameter("type", type);
		query.setParameter("brand", brand);
		
		Object update=query.executeUpdate();	
		
		return (GroceryEntity)update;
	
	} catch (PersistenceException e) {
		e.printStackTrace();
	}
	return GroceryRepository.super.updateByName(name, quantity, price, type, brand);
	}
}
