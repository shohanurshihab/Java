package classes;
import java.lang.*;
public class Employee
{
	private String name;
	private String empId;
	private double salary;

public void setName(String name)
{
	this.name=name;
}
public void setEmpId(String empId)
{
	this.empId=empId;
}
public void setSalary(double salary)
{
	this.salary=salary;
}
String getName( )
{
	return name;
}
String getEmpId( )
{
	return empId;
}
double getSalary( )
{
	return salary;
}
}