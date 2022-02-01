package assertions.asserfalse;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertFalseDemo 
{
	@Test
	public void assertrue0()
	{
		BookService bookservice = new BookService();
		List<Book> listbooks = bookservice.getBooks();		
		assertFalse(listbooks.isEmpty());	
	}
	
	@Test
	public void assertrue1()
	{
		BookService bookservice = new BookService();
		Book book = new Book("101" , "Google", "Nikhil");
		bookservice.addBooks(book);		
		List<Book> listbooks = bookservice.getBooks();		
		assertFalse(listbooks.isEmpty());		
	}
	
	
	@Test
	public void assertrue2()
	{
		BookService bookservice = new BookService();
		Book book = new Book("101" , "Google", "Nikhil");
		bookservice.addBooks(book);		
		List<Book> listbooks = bookservice.getBooks();		
		assertFalse(listbooks.isEmpty(), () -> "List is not empty");		
	}

}
