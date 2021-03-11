package lab5;

public class AgeLimitException extends Exception{
	int age;
	AgeLimitException(int age){
		this.age=age;
	}
	
	public String toString() {
		return "NOT VALID";
	}

}
