import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public void setaccountNumber(int n)
	{
		accountNumber = n;
	}
	public void setaccountHolderName(String h)
	{
		accountHolderName = h;
	}
	public void setbalance(double b)
	{
		balance = b;
	}
	public int getaccountNumber()
	{
		return accountNumber;
	}
	public String getaccountHolderName()
	{
		return accountHolderName;
	}
	public double getbalance()
	{
		return balance;
	}
	public void showDetails()
	{
		System.out.println("Account Number is: "+accountNumber);
		System.out.println("Account Holder Name is: "+accountHolderName);
		System.out.println("Balance is: "+balance);
	}
}
	
