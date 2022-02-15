package com.xworkz.passport.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.util.SingletonEMFUtil;

public class PassportDAOImpl implements PassportDAO{


	@Override
	public void save(PassportEntity entity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
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
