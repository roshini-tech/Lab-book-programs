package lab4;

public class CurrentAcc extends Account{
double overdraftLimit;
void withdraw (double w) {
	int flag;
	if (overdraftLimit<=0)
		flag= 0;
	else
		flag= 1;
}
}
