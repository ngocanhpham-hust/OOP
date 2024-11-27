package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {
		super();
	}
	
	public CompactDisc(String title) {
		super(title);
		this.id = ++numberMedia;
	}
	
	public CompactDisc(String title,String category) {
		this(title);
		this.category = category;
	}
	
	public CompactDisc(String title, String category, String director) {
		this(title,category);
		this.director = director;
	}
	public CompactDisc(String title, String category, String director, float cost) {
		this(title,category,director);
		this.cost = cost;
	}
	public CompactDisc( String title, String category, String director, int length, float cost) {
	    this(title, category,director,cost);
	    this.length = length;
	}
	    public void addTrack(Track... newTracks) {
	        for (Track newTrack : newTracks) {
	            if (tracks.contains(newTrack)) {
	                System.out.println(newTrack.getTitle() + " is already in the list");
	            } else {
	                tracks.add(newTrack);
	            }
	        }
	        System.out.println("All tracks have been added!");
		 }
	    public void removeTrack(Track track) {	
			if(!tracks.contains(track)) {
				System.out.println("this track is not in the list");
				return;
			}
			tracks.remove(track);
		}
	    public void removeTrack(Track...trackstoRemove) {
			boolean Tracknotfound = false;
			for(Track track : trackstoRemove) {
				if(!tracks.contains(track)) {
					Tracknotfound = true;
					System.out.println("Track :" + track.getTitle() + " is not in the list");
				}
				tracks.remove(track);
			}
			if(!Tracknotfound) {
				System.out.println("All track you want have been removed !");
			}
		}
	    
	    public int getLength() {
			int totalLength = 0;
			
			for (int i = 0; i <tracks.size(); i++) {
				totalLength += tracks.get(i).getLength();
			}
			return totalLength;
		}
	    
	    public int getLength1() {
			int total = 0;
			for(Track track : tracks) {
				total += track.getLength();			
			}
			return total;
		}
	    
	    public String getArtist() {
			return artist;
		}
	    
	    @Override
		public void play() {
			System.out.println("CD number of tracks :" + tracks.size());
			System.out.println("CD artist: " + this.getArtist());
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
			for(Track track : tracks) {
				track.play();
			}
		}
	    @Override
		public String toString() {
		    StringBuilder sb = new StringBuilder();
		    sb.append(String.format("%2d.CD - %-20s - %-15s - %-15s - %.2f %-6d   $%n", id, title, category, artist, cost, length));
		    sb.append("Track List:\n");
		    for (Track track : tracks) {
		        sb.append(track.toString()).append("\n");
		    }
		    return sb.toString();
	    }       
}
