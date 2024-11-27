package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
public class Aims {
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
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        
        
        /*anOrder.addDigitalVideoDisc(dvd4);
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Morbius",
                "Science Fiction", 39.99f);*/
    }
}
