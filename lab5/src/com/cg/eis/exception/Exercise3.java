package com.cg.eis.exception;
import java.util.Scanner;
public class Exercise3 {

	static void checkSalary(int sal) throws EmployeeException
	{
		if(sal>3000) {
			System.out.println("VALID");	
		}
		else
		{
		  throw new EmployeeException(sal);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		try {
        checkSalary(sal);
	}catch(EmployeeException e) {
		System.out.println(e);
	}
		finally {
			System.out.println("Done!");
		}

 }

}
