package com.xworkz.coffeeday.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.coffeeday.entity.CoffeeDayEntity;
@Component
public class CoffeeDayRepositoryImpl implements CoffeeDayRepository {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	
	public CoffeeDayRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory=entityManagerFactory;
	}
	
	@Override
	public void save(CoffeeDayEntity coffeeDayEntity) {
		
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	try {
		
		entityManager.getTransaction().begin();
		entityManager.persist(coffeeDayEntity);
		entityManager.getTransaction().commit();
	} catch (PersistenceException e) {
		e.printStackTrace();
		entityManager.getTransaction().getRollbackOnly();
	}
	finally {
		
		entityManager.close();
	}
		

	}

}
