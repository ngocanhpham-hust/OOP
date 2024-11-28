package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Cart{
    public static final int MAX_NUMBERS_ORDERED = 200;
    public Cart() {
    }
    
	private static List<Media> itemsOrdered = new ArrayList<Media>();
	
	public  void addMedia(Media media) {
		if(itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is full !");
		}
		else {
			itemsOrdered.add(media);
			System.out.println("Success added " + media.getTitle() + " to the cart !");
			System.out.println("Current number of items: " + itemsOrdered.size());
		}
	}
	
	public void addMedia(Media ... mediaList) {
		 int spaceAvailable = MAX_NUMBERS_ORDERED - itemsOrdered.size();
		 if(mediaList.length <= spaceAvailable) {
			 for(Media item : mediaList) {
				 itemsOrdered.add(item);
				 System.out.println("Added " + item.getTitle() + " to the cart !");
				 System.out.println("Current number of items: " + itemsOrdered.size());
			 }
			 System.out.println("Current number of items: " + itemsOrdered.size());
		 }
		 else {
			 System.out.println("The number of item u want to add is greater than the space available !");
		 }	 
	 }
	 public void removeMedia(Media media) {
		 itemsOrdered.remove(media);		 
	 }
	 
	 public void removeMediaByTitle(String title) {		 
		 boolean notfound = false;
		 for (Media media : itemsOrdered) {
	        if (media.getTitle().equalsIgnoreCase(title)) {	        	
	            itemsOrdered.remove(media);	        
	            break; // Dừng vòng lặp sau khi xóa đối tượng
	        }        	             
	    }
		 if(!notfound) System.out.println("Not found the Media have title: \n"+ title);	
	}
	 
	 public void removeMediaByID(int id) {
		 boolean notfound = false;
		 for(Media media : itemsOrdered) {
			 if(media.getId() == id) {
				 itemsOrdered.remove(media);
				 break;
			 }			 
			}		
		if(!notfound) System.out.println("Not found the Media have ID: \n" + id);
		 }
	 
	 public float totalCost() {
		 float total = 0.0f;
		 for(Media item : itemsOrdered) {
			 total += item.getCost();
		 }
		 return total;
	 }
	 
	 public void printCart() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items: ");
			
		 System.out.printf("%-6s - %-20s - %-15s - %-15s - %-4s : %-2s $%n","id","title","category","director","length","cost");
			// Iterate over the ordered items in the cart
			for(Media media : itemsOrdered) {
				media.toString();
			}
	 }
	 
	 public Media filterByTitle(String title) {
	        for (int i = 0; i < itemsOrdered.size(); i++) {
	            if (itemsOrdered.get(i).getTitle().equals(title)) {	                
	                return itemsOrdered.get(i);
	            }
	        }
	        System.out.println("No match found!");
	        return null;
		}
	 
	 public Media filterByID(int id) {
		 for(int i = 0; i < itemsOrdered.size(); i++) {
			 if(itemsOrdered.get(i).getId() == id ) {
				 return itemsOrdered.get(i);
			 }
		 }
		 System.out.println("No match found!");
	        return null;
	 }
	 public void sortByTitle() {
	        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	        printCart();
	    }
	 public void sortByCost() {
		 Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
		 printCart();
	 }
	 public boolean isEmpty() {
	        return itemsOrdered.isEmpty();
	    }
	 public void clear() {
	        itemsOrdered.clear();
	    }
}


