import java.lang.*;

public class Start
{
	public static void main(String args[])
		{
			Book books[] = new Book[5];
			books[0] =new Book("8888-8754","OJANA" , "SK", 100, 1000 );
			books[1] =new Book("1025-3254","PARA" , "ARIF", 50, 700 );
			books[2] =new Book("6351-2020","DOX" , "AZAD", 70, 5000 );
			books[3] =new Book("2019-2021","SAJID" , "SHIMUL", 90, 1600 );
			books[4] =new Book("2301-9851","ISLAM" , "MAX", 150, 6100 );
		   
		for(int i=0; i<books.length; i++)
		{
			books[i].showDetails();
			System.out.println();
		System.out.println("========================");
		}
		
			
			
			books[0].addQuantity(27);
			System.out.println("Book Quantity after Adding:"+books[0].getAvailableQuantity());
			books[0].sellQuantity(95);
			System.out.println("Book Quantity after Selling:"+books[0].getAvailableQuantity());
			System.out.println();
		    System.out.println("========================");
			
			books[1].addQuantity(35);
			System.out.println("Book Quantity after Adding:"+books[1].getAvailableQuantity());			
			books[1].sellQuantity(51);
			System.out.println("Book Quantity after Selling:"+books[1].getAvailableQuantity());
			System.out.println();
		    System.out.println("========================");
			
			books[2].addQuantity(34);
			System.out.println("Book Quantity after Adding:"+books[2].getAvailableQuantity());			
			books[2].sellQuantity(11);
			System.out.println("Book Quantity after Selling:"+books[2].getAvailableQuantity());
			System.out.println();
		    System.out.println("========================");
			
			books[3].addQuantity(25);
			System.out.println("Book Quantity after Adding:"+books[3].getAvailableQuantity());
			books[3].sellQuantity(73);
			System.out.println("Book Quantity after Selling:"+books[3].getAvailableQuantity());
			System.out.println();
		    System.out.println("========================");
			
			books[4].addQuantity(63);
			System.out.println("Book Quantity after Adding:"+books[4].getAvailableQuantity());
			books[4].sellQuantity(81);
			System.out.println("Book Quantity after Selling:"+books[4].getAvailableQuantity());
			System.out.println();
		    System.out.println("========================");
			
			
			
		}
}