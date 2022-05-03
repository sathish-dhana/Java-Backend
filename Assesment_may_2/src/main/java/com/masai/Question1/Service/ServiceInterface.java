package com.masai.Question1.Service;

import java.util.List;

import com.masai.Question1.Beans.Book;
import com.masai.Question1.Exception.BookNotFoundException;

public interface ServiceInterface {
	
	public void showAllBooks();
	public void showBookById(int id);
	public void addBook(Book book);
	public void deleteBook(Book book);
	public void updateBook(Book book);
}	
