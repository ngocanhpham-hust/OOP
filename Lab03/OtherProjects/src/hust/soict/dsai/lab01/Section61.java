package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;

public class Section61 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null,"You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);

    }
}
