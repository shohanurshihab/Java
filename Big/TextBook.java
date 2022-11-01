import java.lang.*;

public class TextBook extends Book
{
	private int standard;
	
	TextBook()
	{
		
	}
	TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity , int standard)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard=standard;
	}
	public void setstandard(int standard)
	{
		this.standard=standard;
	}
	public int getstandard()
	{
		return standard ;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Book Standard: "+standard);
	}
}