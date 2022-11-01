import java.lang.*;

public class BookShop 
{
	private String name;
	public Book listOfBooks[];
	
	public BookShop()
	{
		this.listOfBooks = new Book [100];
	}
	
	public BookShop(String name, int sizeOfArray)
	{
		this.name = name;
		this.listOfBooks = new Book [sizeOfArray];
	}
		
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean insertBook(Book b)
	{
		boolean flag = false;
		
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == null)
			{
				listOfBooks[i] = b;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeBook(Book b)
	{
		boolean flag = false;
		
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] == b)
			{
				listOfBooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllBooks()
	{
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i] != null)
			{
				System.out.println("Isbn Number: "+listOfBooks[i].getIsbn());
				System.out.println("Book Title:"+listOfBooks[i].getBookTitle());
				System.out.println("Author Name: "+listOfBooks[i].getAuthorName());
				System.out.println("Price: "+listOfBooks[i].getPrice());
				System.out.println("Available Quantity : "+listOfBooks[i].getAvailableQuantity());
				//System.out.println("Category: "+listOfBooks[i].getCategory());
				//System.out.println("Standard: "+listOfBooks[i].getstandard());
				System.out.println("==================");
				System.out.println("==================");
			}
			
		}
	}

	
	public Book searchBook(String isbn)
	{
		Book b = null;
		for(int i=0; i<listOfBooks.length; i++)
		{
			if(listOfBooks[i].getIsbn().equals(isbn))
			{
				b = listOfBooks[i];
				
		     	System.out.println("Book Found");
				break;
			}
		}
		return b;
	}
}