package com.bookapp.service;

import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	
	Book addBook(Book book);
	boolean deleteBook(Integer bookId) throws BookNotFoundException;
	Book getBookById(Integer bookId) throws BookNotFoundException;
	Book updateBook(Book book);
	
	List<Book> getAllBooks();
	List<Book> getBookByAuthor(String author) throws BookNotFoundException;
	List<Book> getBookByCategory(String category) throws BookNotFoundException;
	
	List<Book> findByTitleAndAuthor(String title, String author)throws BookNotFoundException;
	List<Book> findBooksByTitleAndPrice(String title, Double price)throws BookNotFoundException;
	//List<Book> getByCategory(String category);

}
