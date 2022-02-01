package assertions.assertnotnull;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertNotNullDemo 
{
	@Test
	public void assertNotNull0()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("103");
		assertNotNull(actualBook);
	}
	
	@Test
	public void assertNotNull1()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("101");
		assertNotNull(actualBook);
	}
	
	@Test
	public void assertNotNull2()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("102");
		assertNotNull(actualBook, () -> "Book is Not Empty");
	}


}
