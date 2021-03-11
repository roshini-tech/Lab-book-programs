package com.cg.jpastart.dao;

import com.cg.jpastart.entity.Author;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import java.util.logging.Level;
import com.cg.jpastart.util.JPAUtil;

public class AuthorDAOImpl implements AuthorDAO {

	private EntityManagerFactory factory = null;
	
	public AuthorDAOImpl() {
		factory = JPAUtil.getEntityManagerFactory();
	}
	
	@Override
	public void save(Author author1) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE); 
		
		EntityManager entityManager = factory.createEntityManager();        
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.persist(author1);
        txn.commit();
        entityManager.close();
		
	}

	@Override
	public void delete(int id) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE); 
		
		EntityManager entityManager = factory.createEntityManager();     
		Author author = entityManager.find(Author.class, id);
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.remove(author);
        txn.commit();
        entityManager.close();
		
	}

	@Override
	public void update(Author author) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE); 
		
		EntityManager entityManager = factory.createEntityManager();    
	
        EntityTransaction txn = entityManager.getTransaction();
        txn.begin();
        entityManager.merge(author);
        txn.commit();
        entityManager.close();
		
	}

	@Override
	public Author findAuthor(int id) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE); 

		EntityManager entityManager = factory.createEntityManager();
		Author author = entityManager.find(Author.class, id);
		
		entityManager.close();
		return author;
	}

}
