package masai.Question2;

public class Book {
	String name;
	String Author;
	int numberOfPages;
	double bookPrice;
	boolean availlable;
	Genre genre;
	
	
	public Book(String name, String author, int numberOfPages, double bookPrice, boolean availlable, Genre genre) {
		super();
		this.name = name;
		this.Author = author;
		this.numberOfPages = numberOfPages;
		this.bookPrice = bookPrice;
		this.availlable = availlable;
		this.genre = genre;
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


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public boolean isAvaillable() {
		return availlable;
	}


	public void setAvaillable(boolean availlable) {
		this.availlable = availlable;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
}
