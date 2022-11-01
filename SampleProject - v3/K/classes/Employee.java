package classes;

import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private double salary;
	
	public Employee(){System.out.println("E-Employee");}
	public Employee(String empId, String name, double balance)
	{
		System.out.println("P-Employee");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmpId(String empId){this.empId = empId;}
	public void setName(String name){this.name = name;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getEmpId(){return empId;}
	public String getName(){return name;}
	public double getSalary(){return salary;}
	
	
}