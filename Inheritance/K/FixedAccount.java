import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount(){}
	public FixedAccount(String accountNumber, String accountHolderName, double balance, int tenureYear)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.tenureYear = tenureYear;
	}
	public void setTenureYear(int tenureYear){this.tenureYear = tenureYear;}
	public int getTenureYear(){return tenureYear;}
	
}