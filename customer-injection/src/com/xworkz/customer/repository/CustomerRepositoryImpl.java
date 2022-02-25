package com.xworkz.customer.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.customer.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public CustomerRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory=entityManagerFactory;
	}
	
	@Override
	public void save(CustomerEntity customerEntity) {
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(customerEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		
	}
		
	}

}
