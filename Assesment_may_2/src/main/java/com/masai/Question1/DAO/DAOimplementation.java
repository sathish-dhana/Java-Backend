package com.masai.Question1.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.Question1.Beans.Book;
import com.masai.Question1.DButil.ProvideEntityManager;
import com.masai.Question1.Exception.BookNotFoundException;

@Repository
public class DAOimplementation implements DAOinterface {

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		List<Book> li = null;
		
		EntityManager entityManager = ProvideEntityManager.provideEntityManager();
		
		TypedQuery<Book> listOfEmp = entityManager.createQuery("select a from Book a", Book.class);
		
		li = listOfEmp.getResultList();
		
		entityManager.close();
		
		return li;
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		
		Book book = null;
		
		EntityManager entityManager = ProvideEntityManager.provideEntityManager();
		
		book = entityManager.find(Book.class, id);
		
		entityManager.close();
		
		return book;

	}

	@Override
	public boolean addBook(Book book) throws BookNotFoundException {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		EntityManager entityManager = ProvideEntityManager.provideEntityManager();
		
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(book);
			entityManager.getTransaction().commit();
			flag = true;
		}catch (Exception e) {
			// TODO: handle exception
			new BookNotFoundException("Book not found");
		}
		
		entityManager.close();
		
		return flag;
	}

	@Override
	public boolean deleteBook(Book book) throws BookNotFoundException {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		EntityManager entityManager = ProvideEntityManager.provideEntityManager();
		
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(book);
			entityManager.getTransaction().commit();
			flag = true;
		}catch (Exception e) {
			// TODO: handle exception
			new BookNotFoundException("Book not found");
		}
		
		entityManager.close();
		
		return flag;
	}

	@Override
	public boolean updateBook(Book book) throws BookNotFoundException {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		EntityManager entityManager = ProvideEntityManager.provideEntityManager();
		
		Book tempbook = null;
		
		tempbook = entityManager.find(Book.class, book.getBookId());
		
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(book);
			entityManager.persist(tempbook);
			entityManager.getTransaction().commit();
			flag = true;
		}catch (Exception e) {
			// TODO: handle exception
			new BookNotFoundException("Book not found");
		}
		
		entityManager.close();
		
		return flag;
	}
	
	
}
