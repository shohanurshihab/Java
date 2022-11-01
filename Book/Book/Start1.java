import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Book b1 = new Book();
		
		b1.setIsbn("ertghjk");
		b1.setBookTitle("Gitanjali");
		b1.setAuthorName("Rabi");
		b1.setPrice(5.89);
		b1.setAvaiableQuantity(15);
		
		System.out.println("ISBN: "+b1.getIsbn());
		System.out.println("Book Title: "+b1.getBookTitle());
		System.out.println("Author Name: "+b1.getAuthorName());
		System.out.println("Price: "+b1.getPrice());
		System.out.println("Available Quantity: "+b1.getAvailableQuantity());
		
		System.out.println("-----------------------");
		
		Book b2 = new Book("ecvbn", "Beth", "Max", 210.5, 88);
		b2.showDetails();
	}
}