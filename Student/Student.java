import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public void setid(int i)
	{
		id = i;
	}
	public void setname(String n)
	{
		name = n;
	}
	public void setcgpa(double c)
	{
		cgpa = c;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	
	public static void main(String args[])
	{
		Student s = new Student();
		
		s.setid(225566);
		s.setname("shakespere");
		s.setcgpa(3.75);
		
		System.out.println("id is: "+s.getid());
		System.out.println("name is: "+s.getname());
		System.out.println("cgpa is: "+s.getcgpa());
		
	}
	
}
