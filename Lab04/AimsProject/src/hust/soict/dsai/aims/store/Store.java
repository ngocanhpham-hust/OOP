package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Store {
	
	private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[100];
    private int qtyInStore = 0;
    public void removeDVD(DigitalVideoDisc disc){
        if(qtyInStore <= 0){
            System.out.println("Store is already empty");
            return;
        }
        for(int i = 0; i < qtyInStore; i ++){
            if(itemInStore[i].equals(disc)){
                itemInStore[i] = itemInStore[qtyInStore-1];
                itemInStore[qtyInStore-1] = null;
                qtyInStore = qtyInStore - 1;
                System.out.println("The disc has been removed");
                return;
            }
        }
        System.out.println("Disc is not in your store");
        return;
    }
    
    public void addDVD(DigitalVideoDisc disc){
        itemInStore[qtyInStore] = disc;
        qtyInStore = qtyInStore + 1;
        System.out.println("The disc has been added");
    }
    
    public void print() {
		System.out.println("***********************STORE LIST***********************");
		for(int i = 0; i < qtyInStore; i++) {
			System.out.println((i+1) + ". DVD - " + itemInStore[i].getTitle() + " - " + itemInStore[i].getCategory() + " - " 
			+ itemInStore[i].getDirector() + " - " + itemInStore[i].getLength() + " - " + itemInStore[i].getCost() + " $");}
		System.out.println("********************************************************");
		return;
		}
    
	return itemsInStore;
	}
	public void setItemsInStore(List<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	
	public Media searchByTitle(String title) {
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).getTitle().equals(title)) {
                
                return itemsInStore.get(i);
            }
        }
        System.out.println("No match found!");
        return null;
	}
}
