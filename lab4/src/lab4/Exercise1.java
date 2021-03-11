package lab4;

public class Exercise1 {

	public static void main(String[] args) {
		//Person p=new Person();
		Account s=new Account();
		s.setName("Smith");
		s.setAge(20);
		s.setBalance(2000);
		Account k=new Account();
		k.setName("Kathy");
		k.setAge(21);
		k.setBalance(3000);
		s.deposit(2000);
		k.withdraw(2000);
		System.out.println("Updated balance in Smith's Account :"+s.getBalance());
		System.out.println("Updated balance in Kathy's Account :"+k.getBalance());
	}

}
