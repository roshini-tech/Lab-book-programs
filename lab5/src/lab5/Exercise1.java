package lab5;
import java.util.Scanner;
public class Exercise1 {
   
	static void checkEligibilty(int age) throws AgeLimitException
	{
		if(age>15) {
			System.out.println("VALID");	
		}
		else
		{
		  throw new AgeLimitException(age);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try {
        checkEligibilty(age);
	}catch(AgeLimitException e) {
		System.out.println(e);
	}
		finally {
			System.out.println("Done!");
		}

 }
}

