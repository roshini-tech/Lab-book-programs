package com.cg.dao;
import java.util.List;

import com.cg.entities.*;

public interface BookAuthorDao {
	
	List<Book> fetchAll();
	List<Book> fetchByName(String s);
	List<Book> fetchRange(int x, int y);
	String fetchName(int id);
	void add(Book book);
}
