package assertions.assertequal;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertEqualsDemo 
{
	@Test
	public void assertEquals0()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("101");
		assertEquals("101", actualBook.getBookId());
		assertEquals("Java", actualBook.getTitle());
	}
	
	@Test
	public void assertEquals1()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("102");
		assertEquals("101", actualBook.getBookId());
		assertEquals("Java1", actualBook.getTitle());
	}
	
	@Test
	public void assertEquals2()
	{
		BookService bookservice = new BookService();
		Book book1 = new Book("101" , "Java" , "Nikhil");
		Book book2 = new Book("102" , "C++" , "Mohit");		
		bookservice.addBooks(book1);
		bookservice.addBooks(book2);		
		Book actualBook = bookservice.returnBook("101");
		assertEquals("101", actualBook.getBookId());
		assertEquals("Java2", actualBook.getTitle() , () -> "Book Title is not correct");
	}

}
