package assertions.assertthrows;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.nikhil.bookstore.exception.BookNotFoundException;
import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertThrowsDemo 
{
	
	@Test
	public void assertThrows()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);

		Assertions.assertThrows(Exception.class, () -> bookservice.returnBookByTitle("C"));

	}
	

}
