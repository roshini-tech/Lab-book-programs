package com.cg.service;

import java.util.List;

import com.cg.entities.*;

public interface BookAuthorService {
	void addVal(Book book);
	List<Book> getAll();
	List<Book> getByName(String s);
	List<Book> getRange(int x, int y);
	String getName(int id);
}
