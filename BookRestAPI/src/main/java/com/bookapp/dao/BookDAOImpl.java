package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
@Service
public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>();
		for(Book book : showBookList()) {
			if(book.getAuthor().equals(author)) {
				newBookList.add(book);
			}
			
		}
		return newBookList;
		//return showBookList().stream().filter;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		//return null;
		//List<Book> newBookList = showBookList();
		for(Book book : showBookList()) {
			if(book.getBookId()==(id)) 
				return book;
		}
		return null;
		//return newBookList;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		//return null;
		List<Book> newBookList = new ArrayList<>();
		for(Book book : showBookList()) {
			if(book.getCategory().equals(category)) {
				newBookList.add(book);
			}
			
		}
		return newBookList;
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(new Book(1,"Learn Java","tech","kathy",900.0),
				new Book(2,"C++","language","kat",700.0),
				new Book(3,"Python","techie","hy",8100.0),
				new Book(4,"Node","tech","Phani",1900.0));
	}
}
