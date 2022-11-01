import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public Account()
	{
		System.out.println("Empty-Account");
	}
	
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("Para-Account");
	}
		
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName ;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber ;
	}
	
	public String getAccountHolderName()
	{
		return accountHolderName ;
	}
	
	public double getBalance()
	{
		return balance ;
	}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Balance: "+ balance);
	}



	public static void main(String args[])
	{
		Account a1 = new Account();
		
		a1.setAccountNumber(1111);
		a1.setAccountHolderName("OOP1 K");
		a1.setBalance(2000.0);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
		
		System.out.println("-----------------------");
		
		Account a2 = new Account(1112, "OOP1 J", 2100.0);
		a2.showDetails();
	}
}
