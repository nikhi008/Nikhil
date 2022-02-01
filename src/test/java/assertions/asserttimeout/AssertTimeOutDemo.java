package assertions.asserttimeout;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.nikhil.bookstore.model.Book;
import com.nikhil.bookstore.service.BookService;

public class AssertTimeOutDemo 
{
	@Test
	public void aeerttimeout()
	{
		BookService bookservice = new BookService();
		
		for(int i=1 ;i<=10000 ;i++)
		{
		    bookservice.addBooks(new Book(String.valueOf(i) , "Java" , "Nikhil"));
		}
		
		List<String> actualtitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> 
		                                         { 
		                                        	 actualtitles.addAll(bookservice.returnBookByPublisher("Nikhil")); 
		                                         } 
		             );
		assertEquals(10000, actualtitles.size());
	}

}
