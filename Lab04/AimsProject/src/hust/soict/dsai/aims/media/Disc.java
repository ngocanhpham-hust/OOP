package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected int length;
	protected String director;

	public Disc() {
		super();         
    }
	public Disc(String title) {
		super();
		this.title = title;
	}
	public Disc(String title, String category) {
		this(title);
		this.category = category;
	}
	public Disc(String title, String category, String director) {
		this(title,category);
		this.director = director;
	}
	public Disc(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }
	public Disc(String title, String category, float cost, int length, String director) {
        this(title, category, cost); // Invoke the constructor of the Media class
        this.length = length;
        this.director = director;
	}
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	

}
