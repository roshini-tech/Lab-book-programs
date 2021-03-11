package com.cg.jpastart.dao;

import com.cg.jpastart.entity.Author;

public interface AuthorDAO {
	
	void save(Author author);
	void delete(int id);
	void update(Author author);
	Author findAuthor(int id);
}
