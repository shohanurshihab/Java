package interfaces;

import java.lang.*;
import classes.Account;

public interface AccountOperations
{
	boolean insertAccount(Account a);
	boolean removeAccount(Account a);
	void showAllAccounts();
	Account searchAccount(String accountNumber);
}