package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exceptions.BookNotFoundException;
//import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		Book newBook = bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
		return true;
	}

	@Override
	public Book getBookById(Integer bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookRepository.findById(bookId)
		.orElseThrow(()-> new BookNotFoundException("Id not available") );
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByAuthor(author);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
	}

	@Override
	public List<Book> getBookByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByCategoryOrderByTitleAsc(category);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Category not available");
		}
		return bookList;
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList = bookRepository.findByTitleAndAuthor(title, author);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book with Title and Author not available");
		}
		return bookList;
	}

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, Double price)throws BookNotFoundException {
		// TODO Auto-generated method stub
		List<Book> bookList =  bookRepository.findBooksByTitleAndPrice(title, price);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book with Title and Author not available");
		}
		return bookList;
	}
	
	

}
