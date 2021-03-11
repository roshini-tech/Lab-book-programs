package com.cg.eis.exception;

public class EmployeeException extends Exception {
	int sal;
	EmployeeException(int sal){
		this.sal=sal;
	}
	
	public String toString() {
		return "NOT VALID";
	}
}
