package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Collections;

public class TesttoString {
	public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<Media>();
       
        CompactDisc cd1 = new CompactDisc("ABC CD", "CD Category", "CD Artist", 60, 9.99f);
        	 new Track("Track Title", 180);
        	cd1.addTrack(new Track("Track Title", 180));
        mediaList.add(cd1);
        
        
        mediaList.add(new DigitalVideoDisc("BCD DVD", "DVD Category", "DVD Director",14, 120.5f));
        mediaList.add(new Book( "Book Title", "Book Category", 19.99f));
        mediaList.add(new CompactDisc("CD Title", "CD Category", "CD Artist",  60,9.99f));
        mediaList.add(new DigitalVideoDisc("DVD Title", "DVD Category", "DVD Director", (int) 14.99f, 120));
        mediaList.add(new Book( "Book Title", "Book Category", 19.99f));
        mediaList.add(new DigitalVideoDisc("DVD Title", "DVD Category", "DVD Director", (int) 14.99f, 120));
        
        Collections.sort(mediaList, Media.COMPARE_BY_TITLE_COST);
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
        System.out.println("------------------------------------");
        
        Collections.sort(mediaList, Media.COMPARE_BY_COST_TITLE);
        for (Media media : mediaList) {
        	System.out.println(media.toString());
        }
    }

}
