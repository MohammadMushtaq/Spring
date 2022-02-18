package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;


public class PassportDAOImpl implements PassportDAO{
	
private EntityManagerFactory entity1;

public PassportDAOImpl(EntityManagerFactory entity1) {
	this.entity1=entity1;
}

	@Override
	public void save(PassportEntity entity) {
		EntityManager entityManager= entity1.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(entity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		
	}

}
}
