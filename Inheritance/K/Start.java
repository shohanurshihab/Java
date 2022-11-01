import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		SavingsAccount.setPerTransactionLimit(10000.0);
		SavingsAccount sa1 = new SavingsAccount();
		
		sa1.setAccountHolderName("Mr. ABC");
		sa1.setAccountNumber("111-1111-111111");
		sa1.setBalance(5000.0);
		sa1.setInterestRate(5.7);
		
		SavingsAccount sa2 = new SavingsAccount("111-1111-111112","Ms. XYZ", 4000.0, 7.5);
		
		System.out.println("Account Holder Name: "+sa1.getAccountHolderName());
		System.out.println("Account Number: "+sa1.getAccountNumber());
		System.out.println("Balance: "+sa1.getBalance());
		System.out.println("Interest Rate: "+sa1.getInterestRate());
		System.out.println("Per Transaction Limit: "+ SavingsAccount.getPerTransactionLimit());
		System.out.println("-------------------------------");
		sa2.showDetails();
		
		
		System.out.println("-------------------------------");
		FixedAccount.setPerTransactionLimit(10000.0);
		FixedAccount fa1 = new FixedAccount();
		
		fa1.setAccountHolderName("Mr. ABC");
		fa1.setAccountNumber("222-1111-111111");
		fa1.setBalance(50000.0);
		fa1.setTenureYear(5);
		
		FixedAccount fa2 = new FixedAccount("222-1111-111112","Ms. XYZ", 40000.0, 7);
		
		System.out.println("Account Holder Name: "+fa1.getAccountHolderName());
		System.out.println("Account Number: "+fa1.getAccountNumber());
		System.out.println("Balance: "+fa1.getBalance());
		System.out.println("Tenure Year: "+fa1.getTenureYear());
		System.out.println("Per Transaction Limit: "+ FixedAccount.getPerTransactionLimit());
		System.out.println("-------------------------------");
		fa2.showDetails();
	}
}