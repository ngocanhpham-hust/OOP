package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println("Author added " + authorName);
		}
		else {
			System.out.println("Author already exist: "+ authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author removed: " + authorName);
		}
		else {
			System.out.println("Author not exist in list:" + authorName);
		}
	}
	public Book() {
		

	}

}
