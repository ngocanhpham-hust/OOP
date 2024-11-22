package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class Section224 {
    public static void main(String[] args) {
        String strnum1, strnum2;
        String strnotif = "Your input: ";
        strnum1 = JOptionPane.showInputDialog(null,"Input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strnotif += strnum1 + " and ";
        strnum2 = JOptionPane.showInputDialog(null,"Input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strnotif += strnum2;
        JOptionPane.showMessageDialog(null, strnotif, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);


        
    }
    
}
