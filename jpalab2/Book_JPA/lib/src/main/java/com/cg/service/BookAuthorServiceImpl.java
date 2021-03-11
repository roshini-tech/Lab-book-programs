package com.cg.service;

import java.util.List;
import com.cg.entities.Book;
import com.cg.dao.BookAuthorDaoImpl;



public class BookAuthorServiceImpl implements BookAuthorService{

	private BookAuthorDaoImpl dao = null;
	
	public BookAuthorServiceImpl() {
		dao = new BookAuthorDaoImpl();
	}
	@Override
	public void addVal(Book book) {
		dao.add(book);
	}

	@Override
	public List<Book> getAll() {
		return dao.fetchAll();
	}

	@Override
	public List<Book> getByName(String s) {
		return dao.fetchByName(s);
	}

	@Override
	public List<Book> getRange(int x, int y) {
		return dao.fetchRange(x, y);
	}

	@Override
	public String getName(int id) {
		return dao.fetchName(id);
	}

}
