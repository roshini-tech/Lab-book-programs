package lab4;

public class SavingsAcc extends Account{
   final double minBalance=500;
   void withdraw (double minBalance) {
		if(minBalance>=500)
		{
			System.out.println("Withdraw can happen");
		}
			
	}
}
