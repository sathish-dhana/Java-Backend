package masai.Question2;

import java.util.List;

public class BookDatabase {
	List<Book> fantasyCollection;
	List<Book> sportsCollection;
	List<Book> EducaionalCollection;
	List<Book> fictionCollection;
	List<Book> scienceCollection;
	
	public BookDatabase(List<Book> fantasyCollection, List<Book> sportsCollection, List<Book> educaionalCollection,
			List<Book> fictionCollection, List<Book> scienceCollection) {
		super();
		this.fantasyCollection = fantasyCollection;
		this.sportsCollection = sportsCollection;
		this.EducaionalCollection = educaionalCollection;
		this.fictionCollection = fictionCollection;
		this.scienceCollection = scienceCollection;
	}

	public List<Book> getFantasyCollection() {
		return fantasyCollection;
	}

	public void setFantasyCollection(List<Book> fantasyCollection) {
		this.fantasyCollection = fantasyCollection;
	}

	public List<Book> getSportsCollection() {
		return sportsCollection;
	}

	public void setSportsCollection(List<Book> sportsCollection) {
		this.sportsCollection = sportsCollection;
	}

	public List<Book> getEducaionalCollection() {
		return EducaionalCollection;
	}

	public void setEducaionalCollection(List<Book> educaionalCollection) {
		EducaionalCollection = educaionalCollection;
	}

	public List<Book> getFictionCollection() {
		return fictionCollection;
	}

	public void setFictionCollection(List<Book> fictionCollection) {
		this.fictionCollection = fictionCollection;
	}

	public List<Book> getScienceCollection() {
		return scienceCollection;
	}

	public void setScienceCollection(List<Book> scienceCollection) {
		this.scienceCollection = scienceCollection;
	}
	
	
 }
