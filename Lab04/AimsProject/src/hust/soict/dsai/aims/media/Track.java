package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	

	public Track() {
		// TODO Auto-generated constructor stub
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
topic
	public String getTitle() {
		return title;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
		}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { 
			return true;
		}
		if(obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		Track otherTrack = (Track) obj;
			return (this.getTitle().equals(otherTrack.title) && this.getLength() == otherTrack.length);
	}
	@Override
	public String toString() {
		return "Track : " + title +" Length " + length;
	}
}
	
