package assertions.assertnotequal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertNotEqualDemo 
{
	@Test
	public void assertNotEquals0()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("101");
		assertNotEquals("101", actualBook.getBookId());
		assertNotEquals("Java", actualBook.getTitle());
	}
	
	@Test
	public void assertNotEquals1()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("102");
		assertNotEquals("101", actualBook.getBookId());
		assertNotEquals("Java1", actualBook.getTitle());
	}
	
	@Test
	public void assertNotEquals2()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("102");
		assertNotEquals("101", actualBook.getBookId());
		assertNotEquals("Java", actualBook.getTitle() , () -> "Book Title is correct");
	}

}
