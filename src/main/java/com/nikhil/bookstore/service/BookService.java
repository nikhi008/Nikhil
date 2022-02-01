package com.nikhil.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import com.nikhil.bookstore.exception.BookNotFoundException;
import com.nikhil.bookstore.model.Book;

public class BookService 
{
	private List<Book> listbooks = new ArrayList<Book>();
	
	public void addBooks(Book book)
	{
		listbooks.add(book);
	}
	
	public List<Book> getBooks()
	{
		return listbooks;
	}
	
	public Book returnBook(String bookId)
	{
		for(Book book : listbooks)
		{
			if(bookId.equals(book.getBookId()))
			{
				return book;
			}
		}	
		return null;
	}
	
	public Book returnBookByTitle(String bookTitle)
	{
		for(Book book : listbooks)
		{
			if(bookTitle.equals(book.getTitle()))
			{
				return book;
			}
		}	
		throw new BookNotFoundException("Book Not Found!");
	}
	
	public List<String> returnBookByPublisher(String publisher)
	{
		List<String> booktitles = new ArrayList();
		for(Book book : listbooks)
		{
			if(publisher.equals(book.getPublisher()))
			{
				booktitles.add(book.getTitle());
			}
		}	
		return booktitles;
	}

}
