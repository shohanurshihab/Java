import java.lang.*;

public class Account
{
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	public static double perTransactionLimit;
	
	public Account(){}
	public Account(String accountHolderName, String accountNumber, double balance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public static void setPerTransactionLimit(double ptl)
	{
		perTransactionLimit = ptl;
	}
	public static double getPerTransactionLimit(){return perTransactionLimit;}
	
	public void setAccountHolderName(String accountHolderName){this.accountHolderName = accountHolderName;}
	public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;}
	public void setBalance(double balance){this.balance = balance;}
	
	public String getAccountHolderName(){return accountHolderName;}
	public String getAccountNumber(){return accountNumber;}
	public double getBalance(){return balance;}
	
	public void depositMoney(double amount)
	{
		if(amount>0 && amount<=perTransactionLimit)
		{
			System.out.println("Previous Balance :" + balance);
			System.out.println("Depositing Amount :" + amount);
			balance = balance + amount;
			System.out.println("Current Balance : "+balance);
		}
		else
		{
			System.out.println("Invalid Request");
		}
	}
	public void withdrawMoney(double amount)
	{
		if(amount>0 && amount<= balance && amount<=perTransactionLimit)
		{
			System.out.println("Previous Balance :" + balance);
			System.out.println("Withdrawing Amount :" + amount);
			balance = balance - amount;
			System.out.println("Current Balance : "+balance);
		}
		else
		{
			System.out.println("Invalid Request");
		}
	}
	public void showDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Per Transaction Limit: "+perTransactionLimit);
	}
}