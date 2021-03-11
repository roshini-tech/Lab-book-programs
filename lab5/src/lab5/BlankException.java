package lab5;

public class BlankException extends Exception{
	String fn,ln;
	
	BlankException(String fn,String ln){
		this.fn=fn;
		this.ln=ln;
	}
	
	public String toString() {
		return "FULL NAME REQUIRED!";
}
}
