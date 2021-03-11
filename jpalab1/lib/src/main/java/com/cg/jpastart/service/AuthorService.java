package com.cg.jpastart.service;

import com.cg.jpastart.entity.Author;

public interface AuthorService {
	
	void addAuthor(Author author);
	void removeAuthor(int id);
	void updateAuthor(Author author);
	Author fetchAuthorById(int id);
	
}
