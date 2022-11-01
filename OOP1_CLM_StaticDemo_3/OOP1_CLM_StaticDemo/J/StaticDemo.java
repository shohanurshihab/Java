import java.lang.*;

public class StaticDemo
{
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		StaticDemo sd = new StaticDemo();
		
		sd.i1 = 10;
		sd.printValues();
		
		sd.i2 = 300;
		sd.printValues();
		
		StaticDemo.i2 = 400;
		sd.printValues();
		
		StaticDemo.initialize(500);
		sd.printValues();
		
		StaticDemo.initialize(600);
		sd.printValues();
	}
	static
	{
		System.out.println("Hello - 3");
		i2 = 200;
	}
	private int i1;
	private static int i2;
	
	static
	{
		System.out.println("Hello - 2");
	}
		
	public void printValues()
	{
		System.out.println("i1: "+i1);
		System.out.println("i2: "+i2);
	}
	static
	{
		System.out.println("Hello - 4");
	}
	
	static
	{
		System.out.println("Hello - 1");
		i2 = 100;
	}
	public static void initialize(int i)
	{
		System.out.println("Bye Bye");
		i2 = i;
	}
}