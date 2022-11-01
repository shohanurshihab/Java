import java.lang.*;
import fileio.*;
import java.util.*;
import classes.*;

public class Start
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		Account.perTransactionLimit = 10000.0;
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);		//creating an object of Scanner class for taking input from user.
													//nextInt() -> method to take an int as input
													//nextDouble() -> method to take a double as input
													//next() -> method to take a String as input. Condition: no spaces. Only a word. 
													//next().charAt(0) -> method to take a char as input.
		
		boolean repeat = true;
		
		System.out.println("************************");
		System.out.println("Welcome to XYZ Bank");
		System.out.println("************************");
		System.out.println();
		while(repeat)
		{
			System.out.println("What do you want to chose?\n");
			System.out.println("1. Employee Management");
			System.out.println("2. Customer Management");
			System.out.println("3. Customer Account Management");
			System.out.println("4. Account Transactions");
			System.out.println("5. Exit");
			System.out.println();
			
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Employee Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Employee");
					System.out.println("2. Search an Employee");
					System.out.println("3. Remove Existing Employee");
					System.out.println("4. Show All Employees");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1)){System.out.println("Employee Inserted... ID: "+empId1);}
							else{System.out.println("Oops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("Employee Found...........");
								System.out.println("Employee Id: "+e2.getEmpId());
								System.out.println("Employee Name: "+e2.getName());
								System.out.println("Employee Salary: "+e2.getSalary());
							}
							else{System.out.println("Sorry... No Employee Found.....");}
							
							System.out.println();
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Employee");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Employee Id: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								if(b.removeEmployee(e3)){System.out.println("Employee Removed...... ID: "+e3.getEmpId());}
								else{System.out.println("Oops... Something is Wrong...");}
							}
							else{System.out.println("Sorry... No Employee Found to Remove.....");}
							
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Employees");
							System.out.println("***********************************");
							System.out.println();
							
							b.showAllEmployees();
							
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 2:
					
					System.out.println("***********************************");
					System.out.println("Your Choice is: Customer Management");
					System.out.println("***********************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Customer");
					System.out.println("2. Search a Customer");
					System.out.println("3. Remove Existing Customer");
					System.out.println("4. Show All Customers");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Customer");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Customer NID: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Customer Gender: ");
							char gender1 = sc.next().charAt(0);
							System.out.print("Enter Customer Age: ");
							int age1 = sc.nextInt();
							
							Customer c1 = new Customer();
							
							c1.setNid(nid1);
							c1.setGender(gender1);
							c1.setAge(age1);
							
							if(b.insertCustomer(c1)){System.out.println("Customer inserted.. NID: "+c1.getNid());}
							else{System.out.println("Oops... Something is Wrong...");}
							
							System.out.println();
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Customers");
							System.out.println("***********************************");
							b.showAllCustomers();
							
							System.out.println();
							
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 3:
					
					System.out.println("*******************************************");
					System.out.println("Your Choice is: Customer Account Management");
					System.out.println("*******************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1. Insert New Account for a Customer");
					System.out.println("2. Search an Account of a Customer");
					System.out.println("3. Remove Existing Account of a Customer");
					System.out.println("4. Show All Accounts of a Customer");
					System.out.println("5. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Insert New Account for a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.println("There are Two Types of Account: ");
							System.out.println("1. Savings Account");
							System.out.println("2. Fixed Account");
							System.out.println("3. Go Back");
							
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
							
							Account a = null;
							
							if(type == 1)
							{
								System.out.println("Your Type is: Savings Account");
								
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								System.out.print("Enter Account Holder Name: ");
								String ahn = sc.next();
								System.out.print("Enter Balance: ");
								double balance = sc.nextDouble();
								System.out.print("Enter Interest Rate: ");
								double ir = sc.nextDouble();
								
								SavingsAccount sa = new SavingsAccount(an,ahn,balance,ir);
								
								a = sa;
								
							}
							else if(type == 2)
							{
								System.out.println("Your Type is: Fixed Account");
								
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								System.out.print("Enter Account Holder Name: ");
								String ahn = sc.next();
								System.out.print("Enter Balance: ");
								double balance = sc.nextDouble();
								System.out.print("Enter Tenure Year: ");
								int ty = sc.nextInt();
								
								FixedAccount fa = new FixedAccount(an,ahn,balance,ty);
								
								a = fa;
							}
							else if(type == 3)
							{
								System.out.println("Your Type is to Go Back");
							}
							else
							{
								System.out.println("Inavlid Type...........");
							}
							
							if(a != null)
							{
								System.out.print("Enter Customer NID: ");
								int nid1 = sc.nextInt();
								
								Customer c1 = b.searchCustomer(nid1);
								
								if(c1 != null)
								{
									if(c1.insertAccount(a)){System.out.println("Account inserted....");}
									else{System.out.println("Account Not Inserted");}
								}
								else{System.out.println("Oops Someting is Worng");}
							}
							
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Search an Account of a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Remove Existing Account of a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							break;
						
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Accounts of a Customer");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter Customer NID: ");
							int nid4 = sc.nextInt();
								
							Customer c4 = b.searchCustomer(nid4);
							
							if(c4 != null)
							{
								c4.showAllAccounts();
							}
							else{System.out.println("No Customer Found");}
								
							
							
							break;
							
						case 5:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("************************************");
					System.out.println("Your Choice is: Account Transactions");
					System.out.println("************************************");
					
					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------------------");
					System.out.println("1.Deposit Money");
					System.out.println("2. Withdraw Money");
					System.out.println("3. Show all Transactions");
					System.out.println("4. Go Back");
					System.out.println("-----------------------------------");
					System.out.println();
					
					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Deposit Money");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter NID: ");
							int nid1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(nid1);
							
							if(c1 != null)
							{
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								
								Account acc = c1.searchAccount(an);
								
								if(acc != null)
								{
									System.out.print("Enter Amount: ");
									double am = sc.nextDouble();
									System.out.println("Current Balance: "+acc.getBalance());
									if(acc.depositMoney(am))
									{
										System.out.println("Depositing Amount: "+am + "  Successfull ");
										System.out.println("New Balance: "+acc.getBalance());
										frwd.writeInFile(am + " has been Deposited in "+ acc.getAccountNumber());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							}
							
							break;
							
						case 2:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Withdraw Money");
							System.out.println("***********************************");
							System.out.println();
							
							System.out.print("Enter NID: ");
							int nid2 = sc.nextInt();
							
							Customer c2 = b.searchCustomer(nid2);
							
							if(c2 != null)
							{
								System.out.print("Enter Account Number: ");
								String an = sc.next();
								
								Account acc = c2.searchAccount(an);
								
								if(acc != null)
								{
									System.out.print("Enter Amount: ");
									double am = sc.nextDouble();
									System.out.println("Current Balance: "+acc.getBalance());
									if(acc.withdrawMoney(am))
									{
										System.out.println("Withdrawing Amount: "+am + "  Successfull ");
										System.out.println("New Balance: "+acc.getBalance());
										frwd.writeInFile(am + " has been Withdrawn from "+ acc.getAccountNumber());
									}
									else{System.out.println("Oops Something is Worng");}
								}
							}
							
							break;
						
						case 3:
							
							System.out.println("***********************************");
							System.out.println("Your Option is: Show All Transactions");
							System.out.println("***********************************");
							
							frwd.readFromFile();
							System.out.println();
							
							break;
				
							
						case 4:
							
							System.out.println("***********************************");
							System.out.println("Going Back.............");
							System.out.println("***********************************");
							System.out.println();
							
							break;
							
						default:
							
							System.out.println("***********************************");
							System.out.println("Invalid Option");
							System.out.println("***********************************");
							System.out.println();
							
							break;
					}
					
					System.out.println();
					break;
					
				case 5:
					
					repeat = false;
					System.out.println("******************************");
					System.out.println("Thank You for Using Our System");
					System.out.println("******************************");
					System.out.println();
					break;
					
				default:
				
					System.out.println("******************************");
					System.out.println("Invalid Choice");
					System.out.println("******************************");
					System.out.println();
					break;
			}
		}
	}
}

