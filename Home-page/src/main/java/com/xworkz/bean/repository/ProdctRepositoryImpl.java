package com.xworkz.bean.repository;

import javax.activation.DataSource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bean.entity.ProductEntity;

@Component
public class ProdctRepositoryImpl implements ProductRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public void save(ProductEntity productEntity) {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(productEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		
	}

}
}
