package com.cg.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.cg.entities.*;
import com.cg.util.JPAUtil;

public class BookAuthorDaoImpl implements BookAuthorDao{
	private  EntityManagerFactory factory = null;
	
	public BookAuthorDaoImpl() {
		factory = JPAUtil.getEntityManagerFactory();
	}
	
	@Override
	public void add(Book book) {
		EntityManager entityManager = factory.createEntityManager(); 
		EntityTransaction txn = entityManager.getTransaction();
		txn.begin();
		entityManager.persist(book);
		txn.commit();
		entityManager.close();		
	}

	@Override
	public List<Book> fetchAll() {
		EntityManager entityManager = factory.createEntityManager(); 
		entityManager.getTransaction().begin();
		
		List<Book> Books = entityManager.createQuery("From Book", Book.class).getResultList();
		entityManager.getTransaction().commit();
		
		entityManager.close();
		return Books;
	}

	@Override
	public List<Book> fetchByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> fetchRange(int x, int y) {
		EntityManager entityManager = factory.createEntityManager(); 
		Query query = entityManager.createNamedQuery("getBookByRange").setParameter("startVal", x).setParameter("endVal", y);
		List<Book> results = query.getResultList();
		return results;
	}

	@Override
	public String fetchName(int id) {
		EntityManager entityManager = factory.createEntityManager(); 
		Query query = entityManager.createNamedQuery("getBookByRange");
		List<?> results = query.getResultList();
		System.out.println(results);
		return "HI";
	}
}
