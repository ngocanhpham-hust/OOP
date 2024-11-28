package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	@Override
	/*Sort by cost: the system the system displays all the medias in decreasing cost order. In case they have
	the same cost, the medias will be ordered by title (alphabetical).*/
    public int compare(Media media1, Media media2) {
		return Comparator.comparing(Media::getCost,Comparator.reverseOrder()).thenComparing(Media::getTitle).compare(media1, media2);
        
    }
}


