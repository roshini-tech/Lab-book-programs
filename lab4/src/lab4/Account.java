package lab4;

public class Account extends Person{
private long accNum;
private double balance;
private Person accHolder;

public long getAccNum() {
	return accNum;
}

public void setAccNum(long accNum) {
	this.accNum = accNum;
}


public void setBalance(double balance) {
	this.balance = balance;
}

public Person getAccHolder() {
	return accHolder;
}

public void setAccHolder(Person accHolder) {
	this.accHolder = accHolder;
}

void deposit(double d) {
	balance=balance+d;
}

void withdraw (double w) {
	balance=balance-w;
}

double getBalance() {
	return balance;
}
}
