package com.masai.Question1.DAO;

import java.util.List;

import com.masai.Question1.Beans.Book;
import com.masai.Question1.Exception.BookNotFoundException;

public interface DAOinterface {
	
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public boolean addBook(Book book) throws BookNotFoundException;
	public boolean deleteBook(Book book) throws BookNotFoundException;
	public boolean updateBook(Book book) throws BookNotFoundException;
	
}
