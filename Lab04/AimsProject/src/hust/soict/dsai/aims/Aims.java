package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust..soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;

import java.util.List;
import java.util.Scanner;

import javax.xml.validation.Validator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Aims {
	
	static Store store = new Store();
	static Cart anOrderCart = new Cart();
	static Object currentMedia = new Object();
	boolean exit = false;
	
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animation", 18.99f);
        
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Winx","Animation");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Tom and Jerry","nimation");
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Bật nó "," Music");
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Doctor Strange","Fiction");
		
		CompactDisc cd1 = new CompactDisc("Bật nó lên","Music","SOOBIN");				
		CompactDisc cd2 = new CompactDisc("Let It Be", "Music", "The Beatles");
		CompactDisc cd3 = new CompactDisc("Hotel California", "Music", "Eagles");
		CompactDisc cd4 = new CompactDisc("Thriller", "Music", "Michael Jackson");
		CompactDisc cd5 = new CompactDisc("The Dark Side of the Moon", "Music", "Pink Floyd");
		CompactDisc cd6 = new CompactDisc("Abbey Road", "Music", "The Beatles");
		CompactDisc cd7 = new CompactDisc("Born in the USA", "Music", "Bruce Springsteen");
		CompactDisc cd8 = new CompactDisc("Rumours", "Music", "Fleetwood Mac");
		CompactDisc cd9 = new CompactDisc("Back in Black", "Music", "AC/DC");
		
		store.addMedia(dvd4,dvd5,dvd6,dvd7, cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8,cd9);
		
		CompactDisc cd21 = new CompactDisc("Thriller", "Pop", "Michael Jackson", 42, 12.99f);
		CompactDisc cd22 = new CompactDisc("Abbey Road", "Rock", "The Beatles", 47, 14.99f);
		CompactDisc cd23 = new CompactDisc("Rumours", "Rock", "Fleetwood Mac", 40, 13.99f);
		CompactDisc cd25 = new CompactDisc("Back in Black", "Rock", "AC/DC", 42, 11.99f);
		CompactDisc cd26 = new CompactDisc("The Eminem Show", "Hip Hop", "Eminem", 68, 10.99f);
		CompactDisc cd27 = new CompactDisc("21", "Pop", "Adele", 48, 12.99f);
		
		store.addMedia(cd27,cd26,cd25,cd23,cd22,cd21);

		store.addMedia( new CompactDisc("Nevermind", "Rock", "Nirvana", 49, 13.99f));
		store.addMedia(new CompactDisc("The Joshua Tree", "Rock", "U2", 50, 14.99f));
		store.addMedia( new CompactDisc("Legend", "Reggae", "Bob Marley", 46, 11.99f));
		
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Joshua Tree", "Music", "U2");
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Bad", "Music", "Michael Jackson");
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("Sgt. Pepper's Lonely Hearts Club Band", "Music", "The Beatles");
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("Darkness on the Edge of Town", "Music", "Bruce Springsteen");
		DigitalVideoDisc dvd14 = new DigitalVideoDisc("Appetite for Destruction", "Music", "Guns N' Roses");
		DigitalVideoDisc dvd15 = new DigitalVideoDisc("Born to Run", "Music", "Bruce Springsteen");
		DigitalVideoDisc dvd16 = new DigitalVideoDisc("The Wall", "Music", "Pink Floyd");
		DigitalVideoDisc dvd17 = new DigitalVideoDisc("American Idiot", "Music", "Green Day");
		DigitalVideoDisc dvd18 = new DigitalVideoDisc("Legend", "Music", "Bob Marley");
		DigitalVideoDisc dvd19 = new DigitalVideoDisc("Purple Rain", "Music", "Prince");

		store.addMedia(new DigitalVideoDisc[] {dvd10,dvd11,dvd12,dvd13,dvd14});
		store.addMedia(dvd15,dvd16,dvd17,dvd18,dvd19);
		store.addMedia(new DigitalVideoDisc("The White Album", "music", "The Beatles"));
		
		Book book1 = new Book("To Kill a Mockingbird", "Fiction", 9.99f);
		Book book2 = new Book("1984", "Dystopian", 8.99f);
		Book book3 = new Book("Pride and Prejudice", "Classic", 7.99f);
		Book book4 = new Book("The Great Gatsby", "Fiction", 9.99f);
		Book book5 = new Book("The Catcher in the Rye", "Coming-of-age", 8.99f);
		
		store.addMedia(book1,book2,book3,book4,book5);
		
		Book book6 = new Book("Brave New World", "Dystopian", 7.99f);
		Book book7 = new Book("To the Lighthouse", "Modernist", 9.99f);
		Book book8 = new Book("The Hobbit", "Fantasy", 8.99f);
		Book book9 = new Book("Crime and Punishment", "Classic", 7.99f);
		
        store.addMedia(book6,book7,book8,book9);
		
		store.addMedia(new Book("The Lord of the Rings", "Fantasy", 9.99f));
		showMenu();
    }
    
    public static String inputTitleMedia() {
	    Scanner scanner = new Scanner(System.in);
	    String titleMedia = "";

	    while (titleMedia.isEmpty()) {
	        System.out.print("Enter the title of the media: ");
	        titleMedia = scanner.nextLine();

	        if (titleMedia.contains("#") || titleMedia.contains("*") || titleMedia.contains("^") ||
	                titleMedia.contains("~") || titleMedia.contains("`")) {
	            System.out.println("Invalid title. The title cannot contain the characters '#', '*', '^', '~', or '`'.");
	            titleMedia = "";
	        }
	    }

	    return titleMedia;
	}
    
    public static int inputInteger(int min, int max) {
	    Scanner scanner = new Scanner(System.in);
	    int n = 0;
	    boolean validInput = false;

	    while (!validInput) {
	        try {	            
	            n = scanner.nextInt();
	            scanner.nextLine(); 
	            if (n < min || n > max) {
	                System.out.println("Invalid input. Please enter an integer between " + min + " and " + max + ".");
	            } else {
	                validInput = true;
	            }
	        } catch (Exception ex) {
	            System.out.println("Invalid input. Please enter an integer.");
	            scanner.nextLine(); 
	        }
	    }
	    return n;
	}
    
    public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3 ");
		
		Scanner scanner = new Scanner(System.in);
		int choose = inputInteger(0,3);
		
		if(choose < 0 || choose > 3) {
			System.out.println("Menu AIMS have only 4 option! Pls choose a number 0-1-2-3");
			return;
		}
		boolean isvalidOption = false;
		while(!isvalidOption) {
			switch (choose) {
			case 1:
				store.printStore();
				storeMenu();
				isvalidOption = true;
				break;
			case 2:
				isvalidOption = true;
				break;
			case 3:
				isvalidOption = true;
				anOrderCart.printCart();
				System.out.println("");
				cartMenu();
				break;				
			default:
				System.out.println("Invalid option. Pls choose a number 0-1-2-3");
				break;
			}						
		}
	}	
    
    public static void storeMenu() {		
		System.out.println("----------------Store Menu-------------------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
				
		boolean isValidOption = false;
		Scanner scanner = new Scanner(System.in);
		int option = inputInteger(0,4);
		
		while(!isValidOption) {
			switch (option) {
			case 1:		
				mediaDetails();
				isValidOption = true;				
				break;
			case 2:
				addAMediaToCart();
				isValidOption = true;
				storeMenu();
				break;
			case 3:
				while(true) {
					System.out.println("************ PLAY A MEDIA ************");
					System.out.println("1. Enter Title of a Media");
					System.out.println("0. Back ");	
					System.out.println("Please choose option 0 or 1");
					System.out.println("---------------------------------------");
					
					int choose = inputInteger(0,1);
					switch (choose) {
					case 1:
						String titleMedia = inputTitleMedia();
						Media selectedMedia = store.searchByTitle(titleMedia);
						playMedia(selectedMedia);					
						break;
					case 0:
						storeMenu();
						break;				
					}			
				}
			case 4:
					anOrderCart.printCart();
					System.out.println("");
					cartMenu();
					isValidOption = true;
					break;
			case 0:
				showMenu();
				isValidOption = true;
				break;						
			}
		}
	}
    
    public static void mediaDetails() {				
		String titleMedia = inputTitleMedia();								
		Media selectedMedia = store.searchByTitle(titleMedia);
		selectedMedia.toString();
		
		boolean validOption = false;	    
	    while(!validOption) {
	    	System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");			
	        System.out.println("2. Play");	        
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			
			int option = inputInteger(0,2);
	        switch (option) {
				case 1:
					anOrderCart.addMedia(selectedMedia); ;
					validOption = false;
					break;			
				case 2:
				    playMedia(selectedMedia);
				    break;
				 case 0:
		                storeMenu();
		                validOption = false;
		                break;				 	        	      				
			}
	    }     
	}	
    public static void addAMediaToCart() {
	    String titleMedia = inputTitleMedia();	    
		Media selectedMedia = store.searchByTitle(titleMedia);
	    anOrderCart.addMedia(selectedMedia);
        return;	            
	    }
	   	
	public static void playMedia(Media selectedMedia) {
		 if (selectedMedia instanceof Playable && (selectedMedia instanceof CompactDisc || selectedMedia instanceof DigitalVideoDisc)) {
		        ((Playable)selectedMedia).play(); 		        
		    }
     	else if ((Media) selectedMedia instanceof Book){
     		System.out.println("Can't not play media with title " + selectedMedia.getTitle()+ " because it is Book !");
     		System.out.println("-------------------------------------------");
     	}		
	}
	
	public static void cartMenu() {
		System.out.println("----------------Cart Menu------------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		
		int option = inputInteger(0,5);
		Boolean check = false;
		switch (option) {
		case 0:
			storeMenu();
			break;
		case 1:
			while(!check) {
				System.out.println("Do you want to Filter by id or by title ?");
				System.out.println("1.Filter by id\n2.Filter by title\n0.Back");
				int filter = inputInteger(0, 2);
				if(filter == 1 ) {
					System.out.println("Enter id to filter: ");
					int id = inputInteger(0,10000);
					Media selectedMedia = anOrderCart.filterByID(id);
					if(selectedMedia != null) {
						System.out.println(selectedMedia.toString());
					}
				}
				if(filter == 2) {
					String title = inputTitleMedia();
					System.out.println("Enter title to filter: ");
					Media selectedMedia = anOrderCart.filterByTitle(title);
					if(selectedMedia != null) {
						System.out.println(selectedMedia.toString());
					}
				}
				if(filter == 0) {
					check = true;
					cartMenu();
				}						
			}			
			break;
		case 2: 
			check = false;
			while(!check) {
				System.out.println("Do you want to sort by title or by cost?");
				System.out.println("1.Sort by title\n2.Sort by cost\n0.Back");
				int sort = inputInteger(0, 2);
				switch(sort) {
				case 1:
					anOrderCart.sortByTitle();
					break;
				case 2: 
					anOrderCart.sortByCost();
					break;
				case 0:
					check = true;
					cartMenu();
					break;				
				}
				
			}
			
				break;
		case 3:
			check = false;
			while(!check) {
				//reove media from cart
				System.out.println("-------------Remove Media from Cart----------");
				System.out.println("Do you want remove by Title or ID?");
				System.out.println("1.Remove by title\n2.Remove by id\n0.Back");
				System.out.println("Choose the option 0-2");
				System.out.println("----------------------------------------------");
				
				int key = inputInteger(0, 2);
				if(key == 1) {
					System.out.println("Enter the string of Media you want to remove:");
					String title = inputTitleMedia();
					anOrderCart.removeMediaByTitle(title);
				}
				if(key == 2) {
					System.out.println("Enter the id of Media to remove:");
					int id = inputInteger(0, 10000);
					anOrderCart.removeMediaByID(id);
				}
				if(key == 0) {
					check = true;
					cartMenu();
					break;
				}
			}
				
		case 4:
			check = false;
			while(!check) {
				System.out.println("************ PLAY A MEDIA ************");
				System.out.println("1. Enter Title of a Media");
				System.out.println("0. Back ");	
				System.out.println("Please choose option 0 or 1");
				System.out.println("---------------------------------------");
				
				int choose = inputInteger(0,1);
				switch (choose) {
				case 1:
					String titleMedia = inputTitleMedia();
					Media selectedMedia = store.searchByTitle(titleMedia);
					playMedia(selectedMedia);					
					break;
				case 0:
					check = true;
					cartMenu();
					break;														
				}
			}
		case 5:
			//Place order
			if(anOrderCart.isEmpty()) {
				System.out.println("The Cart is empty , you have to add Media to Place order!");
				System.out.println("you have return to the cart Menu!");
				cartMenu();
			}
			else {
				System.out.println("An order is created!");
				anOrderCart.clear();
				cartMenu();
			}
			break;
		}
	}
}
