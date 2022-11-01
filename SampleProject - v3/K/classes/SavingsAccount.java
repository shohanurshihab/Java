package classes;

import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount()
	{
		super();
		System.out.println("E-SA");
	}
	public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate)
	{
		super(accountHolderName, accountNumber, balance);
		/*this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;*/
		this.interestRate = interestRate;
		System.out.println("P-SA");
	}
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	public double getInterestRate(){return interestRate;}
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Per Transaction Limit: "+perTransactionLimit);
		System.out.println("Interest Rate: "+interestRate);
	}
}