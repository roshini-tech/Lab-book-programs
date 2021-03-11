package com.cg.jpastart.main;

import com.cg.jpastart.entity.Author;
import com.cg.jpastart.service.AuthorServiceImpl;
import java.util.Scanner;

public class AuthorMain {
	static AuthorMain am = new AuthorMain();
	static Scanner sc = new Scanner(System.in);
	AuthorServiceImpl service = new AuthorServiceImpl();
	
	public int getId() {

		System.out.print("Enter Author ID : ");
		int aid = sc.nextInt();
		return aid;
	}
	
	public String getFName() {

		System.out.print("Enter First Name : ");
		String fName = sc.next();
		return fName;
	}
	
	public String getMName() {

		System.out.print("Enter Middle Name : ");
		String mName = sc.next();
		return mName;
	}
	
	public String getLName() {

		System.out.print("Enter last Name : ");
		String lName = sc.next();
		return lName;
	}
	
	public long getPhNo() {
		System.out.print("Enter Phone No : ");
		long phn = sc.nextLong();
		return phn;
	}
	
	private void addAuthor() {
		Author author = new Author();
		author.setFirstName(am.getFName());
		author.setMiddleName(am.getMName());
		author.setLastName(am.getLName());
		author.setPhoneNo(am.getPhNo());
		
		service.addAuthor(author);
		System.out.println("\nAuthor Added");
		
	}
	
	private void findAuthor() {
		Author author = service.fetchAuthorById(getId());
		printDetails(author);
		
	}
	
	private void updateAuthor() {
		Author author = new Author();
		author.setAuthorID(am.getId());
		author.setFirstName(am.getFName());
		author.setMiddleName(am.getMName());
		author.setLastName(am.getLName());
		author.setPhoneNo(am.getPhNo());
		
		service.updateAuthor(author);
		System.out.println("\nAuthor updated");
		
	}
	
	public void deleteAuthor() {
		service.removeAuthor(getId());
		System.out.print("\nAuthor removed");
	}
	
	public void printDetails(Author author) {
		
		System.out.println("ID : " + author.getAuthorID());
		System.out.println("Name : " + author.getFirstName() + " " + author.getLastName());
		System.out.println("Phone No : " + author.getPhoneNo());

	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter Option : \n 1 - Add \n 2 - Find  \n 3 - Update \n 4 - Delete\n");
		Scanner sc = new Scanner(System.in);

		
		int option = sc.nextInt();
		
		switch(option){
		
		case 1: 
			am.addAuthor();
	        break;
	        
		case 2:    
			am.findAuthor();
			break;
		
		case 3:
			am.updateAuthor();
			break;
		
		case 4:
			am.deleteAuthor();
			break;
			
		default:
			System.out.println("Enter valid Option");
		
		}
        sc.close(); 
	}
}
