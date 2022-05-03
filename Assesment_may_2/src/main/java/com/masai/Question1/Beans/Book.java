package com.masai.Question1.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BookId;
	private String name;
	private String Author;
	private double price;
	
	public Book() {
		
	}
	
	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.Author = author;
		this.price = price;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", Author=" + Author + ", price=" + price + "]";
	}
	
}
