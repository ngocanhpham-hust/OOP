package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	
	/*Sort by title: the system displays all the medias in the alphabet sequence by title. In case they have the
	same title, the medias having the higher cost will be displayed first.*/
	@Override
	public int compare(Media media1, Media media2) {
		return Comparator.comparing(Media::getTitle).thenComparing(Media::getCost,Comparator.reverseOrder()).compare(media1, media2);
	}

}
