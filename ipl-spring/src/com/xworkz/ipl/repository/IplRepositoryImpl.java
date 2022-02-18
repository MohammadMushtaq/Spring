package com.xworkz.ipl.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import com.xworkz.ipl.entity.IplEntity;

public class IplRepositoryImpl implements IplRepository{

	private EntityManagerFactory entityManagerFactory;
	
	public IplRepositoryImpl( EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory=entityManagerFactory;
	}
	
	@Override
	public void save(IplEntity iplEntity) {
		
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(iplEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		
	}
		
		
	}

	
}
