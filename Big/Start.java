import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook b1 = new StoryBook("982_897", "Amar", "SK", 850.03, 700, "NORD1");
		StoryBook b2 = new StoryBook("922_858", "Tomar", "Amir", 217.10, 1700, "MAX 2");
		StoryBook b3= new StoryBook("972_868", "Apnar", "Nafiz", 364.09, 1050, "ULTRA 3");
		StoryBook b4 = new StoryBook("995-274", "Tader", "Shishir", 125.70, 6200, "PRO 4");
		StoryBook b5 = new StoryBook("922_882", "Tomader", "Tutul", 523.04, 1100, "SPECIAL 5");
		TextBook b6 = new TextBook("981_848", "Chemistry", "BDGOVT.", 878.60, 8150, 100);
		TextBook b7 = new TextBook("782_858", "Biology", "BDGOVT.", 635.20, 1506, 100);
		TextBook b8 = new TextBook("582_878", "Geometry", "BDGOVT.", 2531.30, 1580, 100);
		TextBook b9 = new TextBook("482_808", "Electronics", "AIUB", 614.04, 1203, 100);
		TextBook b10 = new TextBook("382_818", "Programming", "AIUB", 542.09, 1107, 100);
		
		b1.showDetails();
		System.out.println("==================");
		b2.showDetails();
		System.out.println("==================");
		b3.showDetails();
		System.out.println("==================");
		b4.showDetails();
		System.out.println("==================");
		b5.showDetails();
		System.out.println("==================");
		b6.showDetails();
		System.out.println("==================");
		b7.showDetails();
		System.out.println("==================");
		b8.showDetails();
		System.out.println("==================");
        b9.showDetails();
		System.out.println("==================");
		b10.showDetails();
		System.out.println("==================");
		BookShop x1 = new BookShop( "Jasmine",6);
		
		
		if(x1.insertBook(b1))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b2))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b3))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b4))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b5))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b6))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b7))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b8))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b9))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
		if(x1.insertBook(b10))
		{
			System.out.println("Successfully Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
	    System.out.println("| | |Details of Book Shop 1| | |");
		
		x1.showAllBooks();
		
		System.out.println("==================");
		System.out.println("==================\n");
		
	
		if(x1.removeBook(b1))
		{
			System.out.println("Successfully Removed");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
        System.out.println("| | |Details of Book Shop 1 after Removing 1 book| | |");
		x1.showAllBooks();
		
		System.out.println("==================");
		System.out.println("==================\n");
		
		
		x1.searchBook("995-274");
		
		
			
		
		
	}
}