package classes;

import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount()
	{
		super();
		System.out.println("E-FA");
	}
	public FixedAccount(String accountNumber, String accountHolderName, double balance, int tenureYear)
	{
		super(accountHolderName, accountNumber, balance);
		/*this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;*/
		this.tenureYear = tenureYear;
		System.out.println("P-FA");
	}
	public void setTenureYear(int tenureYear){this.tenureYear = tenureYear;}
	public int getTenureYear(){return tenureYear;}
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Per Transaction Limit: "+perTransactionLimit);
		System.out.println("Tenure Tear: "+tenureYear);
	}
}