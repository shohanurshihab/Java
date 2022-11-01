package interfaces;

import java.lang.*;
import classes.*;

public interface CustomerOperations
{
	boolean insertCustomer(Customer c);
	boolean removeCustomer(Customer c);
	Customer searchCustomer(int nid);
	void showAllCustomers();
}