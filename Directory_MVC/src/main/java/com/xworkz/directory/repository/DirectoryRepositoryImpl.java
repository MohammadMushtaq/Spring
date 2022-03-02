package com.xworkz.directory.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.directory.DirectoryWebBean;
import com.xworkz.directory.Entity.DirectoryEntity;

@Component
public class DirectoryRepositoryImpl implements DirectoryRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public void save(DirectoryEntity directoryEntity) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(directoryEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		
	}


	}

}
