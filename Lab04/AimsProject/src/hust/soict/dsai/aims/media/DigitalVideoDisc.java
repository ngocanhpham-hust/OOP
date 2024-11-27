package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    
    private static int nbDigitalVideoDiscs = 0;
    
    public String getDirector() {
    	return director;
    }
    
    public String setDirector(String director) {
    	return this.director = director;
    }
    public int getLength() {
    	return length;
    }
    public int setLength(int length) {
    	return this.length = length;
    }

    public DigitalVideoDisc() {
		super();	   
		this.id = ++numberMedia;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;	
		this.id = ++numberMedia;
	}

    public DigitalVideoDisc(String title, String category) {		
		this(title);
		this.category = category;
		
	}

    public DigitalVideoDisc(String title, String category, String director) {
		this(title,category);
		this.director = director;
	
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length) {
		this(title,category,director);
		this.length = length;
	
	}

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {

		this(title,category,director,length);
		this.cost = cost;
	
	}
    
    @Override
    public String toString() {
	    return String.format("%2d.DVD - %-20s - %-15s - %-15s - %-6d : %.2f $%n", id, title, category, director, length, cost);
	}
	
	public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }

    public void show() {
		System.out.println("id: "+id);
		System.out.println("Title: "+title);
		System.out.println("Category: "+category);
		System.out.println("Director: "+director);
		System.out.println("Length: "+length);
		System.out.println("Cost "+ cost);
	}

    @Override
    public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
}




