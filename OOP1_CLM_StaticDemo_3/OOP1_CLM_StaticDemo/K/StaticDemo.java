import java.lang.*;

public class StaticDemo
{
	static
	{
		System.out.println("Hello 2");
		i2 = 10;
	}
	
	private int i1;
	private static int i2;
	
	static
	{
		System.out.println("Hello 4");
	}
	
	public static void initialize(int i)
	{
		i2 = i;
	}
	public static void first()
	{
		System.out.println("This is First");
	}
	public void printValues()
	{
		System.out.println("i1: "+i1);
		System.out.println("i2: "+i2);
	}
	
	static
	{
		System.out.println("Hello 3");
		i2 = 20;
	}
	
	public static void main(String args[])
	{
		StaticDemo.first();
		System.out.println("Inside Main");
		StaticDemo sd = new StaticDemo();
		sd.printValues();
		
		StaticDemo.initialize(100);
		sd.printValues();
		
		StaticDemo.i2 = 200;
		sd.printValues();
	}
	static
	{
		System.out.println("Hello 1");
		i2 = 30;
	}
	
}