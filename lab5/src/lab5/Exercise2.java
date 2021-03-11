package lab5;
import java.util.Scanner;
public class Exercise2 {
    static void checkNotNull(String fn, String ln) throws BlankException
    {
    	if(fn==null && ln==null)
    		throw new BlankException(fn,ln);
    	else
    		System.out.println("VALID NAME :"+fn+" "+ln);
    		
    		
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fn=sc.nextLine();
		String ln=sc.nextLine();
		try {
			checkNotNull(fn,ln);
		}catch(BlankException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("Done!");
		}
	}

}
