package com.xworkz.samsung.repository;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;

import com.xworkz.samsung.entity.SamsungEntity;

@Component
public class SamsungRepositoryImpl implements SamsungRepository {

	
	private EntityManagerFactory entityManagerFactory;
	
	public SamsungRepositoryImpl(EntityManagerFactory entityManagerFactory) {
		
		this.entityManagerFactory= entityManagerFactory;
	}
	
	@Override
	public List<SamsungEntity> save(SamsungEntity samsungEntity) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			
			entityManager.getTransaction().begin();
			entityManager.persist(samsungEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().getRollbackOnly();
		}
		finally {
			
			entityManager.close();
		}
		
		return null;
	}

	@Override
	public String createdBy() {
		
		
		return null;
	}

	@Override
	public void deleted() {
		// TODO Auto-generated method stub

	}

}
