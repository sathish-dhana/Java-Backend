package com.masai.Question1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Question1.Beans.Book;
import com.masai.Question1.DAO.DAOimplementation;
import com.masai.Question1.Exception.BookNotFoundException;

@Service
public class ServiceImplementation implements ServiceInterface{
	
	@Autowired
	DAOimplementation DAOservice;
	
	@Override
	public void showAllBooks() {
		// TODO Auto-generated method stub
		for (Book book : DAOservice.getAllBooks()) {
			System.out.println(book.toString());
		}
	}

	@Override
	public void showBookById(int id) {
		// TODO Auto-generated method stub
		Book book = null;
		book = DAOservice.getBookById(id);
		
		System.out.print(book.toString());
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		try {
			boolean flag = DAOservice.addBook(book);
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		try {
			boolean flag = DAOservice.deleteBook(book);
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		try {
			boolean flag = DAOservice.updateBook(book);
		} catch (BookNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
