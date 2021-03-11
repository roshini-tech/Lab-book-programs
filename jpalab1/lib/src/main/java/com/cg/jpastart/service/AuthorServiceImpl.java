package com.cg.jpastart.service;

import com.cg.jpastart.entity.Author;
import com.cg.jpastart.dao.AuthorDAOImpl;

public class AuthorServiceImpl implements AuthorService {

	private AuthorDAOImpl dao = null;
	
	public AuthorServiceImpl() {
		dao = new AuthorDAOImpl();
	}
	
	@Override
	public void addAuthor(Author author) {
		dao.save(author);		
	}

	@Override
	public void removeAuthor(int id) {
		dao.delete(id);		
	}

	@Override
	public void updateAuthor(Author author) {
		dao.update(author);		
	}

	@Override
	public Author fetchAuthorById(int id) {
		return dao.findAuthor(id);
	}

}
