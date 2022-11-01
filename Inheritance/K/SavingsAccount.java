import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount(){}
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	public double getInterestRate(){return interestRate;}
	
}