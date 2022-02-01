package assertions.assernull;



import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertNullDemo 
{
	public AssertNullDemo()
	{
		System.out.println("Constructor Called");
	}
	
	@Test
	public void assertNull0()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("103");
		assertNull(actualBook);
	}
	
	@Test
	public void assertNull1()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("101");
		assertNull(actualBook);
	}
	
	@Test
	public void assertNull2()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("102");
		assertNull(actualBook, () -> "Book is Not Empty");
	}

}
