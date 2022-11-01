package classes;


import java.lang.*;
import interfaces.*;

public abstract class Account implements ITransactions
{
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;
	public static double perTransactionLimit;
	
	public Account(){System.out.println("E-A");}
	public Account(String accountHolderName, String accountNumber, double balance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("P-A");
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
	
	public boolean depositMoney(double amount)
	{
		if(amount>0 && amount<=perTransactionLimit)
		{
			balance = balance + amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean withdrawMoney(double amount)
	{
		if(amount>0 && amount<= balance && amount<=perTransactionLimit)
		{
			balance = balance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract void showDetails();
}