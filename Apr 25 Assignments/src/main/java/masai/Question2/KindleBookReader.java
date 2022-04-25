package masai.Question2;

import java.util.List;

public class KindleBookReader {
	BookDatabase books;
	UserDatabase users;
	
	
	public KindleBookReader(BookDatabase books) {
		super();
		this.books = books;
	}

	public KindleBookReader(UserDatabase users) {
		super();
		this.users = users;
	}

	public KindleBookReader(BookDatabase books, UserDatabase users) {
		super();
		this.books = books;
		this.users = users;
	}

	public void DisplayBooks(Genre genre) {
		//diplay books by genre
	}
	
	public void AddUser(User user) {
		if (users.isRegistered(user))
			System.out.print("Already Registered");
		else 
			users.addUserToDataBase(user.userId, user);
	}
	
	public void readBook(Book book, User user) {
		if (users.isRegistered(user))
			System.out.print(book + " completely read by " + user);
		else 
			users.addUserToDataBase(user.userId, user);
	}
	
	public boolean memberShipeExtenion(int money, MemberShip membershipPlan) {
		//logic for membershipPlan
		return false;
	}
	
	public boolean createMembership(User user) {
		//logic to createmembership
		return false;
	}
	
	public void showListOfuser() {
		//logic to listusers
		users.getUsersList();
	}
}
