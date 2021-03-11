package com.cg.main;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import com.cg.service.BookAuthorServiceImpl;
import com.cg.entities.*;



public class BookAuthorMain {
	
	static Scanner sc = new Scanner(System.in);
	static BookAuthorMain bm = new BookAuthorMain();
	BookAuthorServiceImpl service = new BookAuthorServiceImpl();
	
	public int getId() {

		System.out.print("Enter Author ID : ");
		int aid = sc.nextInt();
		return aid;
	}
	
	public String getName() {

		System.out.print("Enter Author Name : ");
		String name = sc.next();
		return name;
	}
	
	public String getTitle() {

		System.out.print("Enter Book Title : ");
		String title = sc.next();
		return title;
	}
	
	public int getBookIsbn() {

		System.out.print("Enter Book ISBN : ");
		int isbn = sc.nextInt();
		return isbn;
	}
	
	public int getPrice() {

		System.out.print("Enter Book Price : ");
		int aid = sc.nextInt();
		return aid;
	}
	
	private void addInfo() {
		Author author = new Author();
		author.setAuthorId(bm.getId());
		author.setAuthorName(bm.getName());
		
		Set<Author> auth = new HashSet<>();
		auth.add(author);
		
		Book book = new Book();
		book.setISBN(bm.getBookIsbn());
		book.setTitle(bm.getTitle());
		book.setPrice(bm.getPrice());
		book.setAuthors(auth);
		
		service.addVal(book);
		System.out.println("Added");
	}
	
	private void getAll() {
		System.out.println("\n");
		List<Book> Books = service.getAll();
		for(Book bk : Books) {
			System.out.println(bk.getISBN() + " " + bk.getTitle() + " " + bk.getPrice());
		}
	}
	
	
	private void getAuth() {
		System.out.println(service.getName(getId()));
		}
	
	private void getRange() {
		System.out.println("Enter start val ");
		int start = sc.nextInt();
		System.out.println("Enter end val ");
		int end = sc.nextInt();
		List<Book> books = service.getRange(start, end);
		
		for(Book bk : books) {
			System.out.println(bk.getISBN() + " " + bk.getTitle() + " " + bk.getPrice());
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Option : \n 1 - Add \n 2 - Query all  \n 3 - Query By Auth name \n 4 - List book in price range \n 5 - list auth name with book id \n");
		Scanner sc = new Scanner(System.in);

		
		int option = sc.nextInt();
		
		switch(option){
		
		case 1:
			bm.addInfo();
	        break;
	        
		case 2:    
			bm.getAll();
			break;
		
		case 3:

			break;
		
		case 4:
			bm.getRange();
			break;
			
		case 5:
			bm.getAuth();
			break;
			
		default:
			System.out.println("Enter valid Option");
		
		}
        sc.close(); 
		
	}
}
