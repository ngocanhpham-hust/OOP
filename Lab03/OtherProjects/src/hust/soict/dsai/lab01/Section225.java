package hust.soict.dsai.lab01;

import javax.swing.*;



public class Section225 {
    public static void main(String[] args) {
        String strn1, strn2;
        String res = "";
        strn1 = JOptionPane.showInputDialog("Input the first number: ");
        double num1 = Double.parseDouble(strn1);
        strn2 = JOptionPane.showInputDialog("Input the second number: ");
        double num2 = Double.parseDouble(strn2);
        if (num2 != 0){res += "\nSum: " + Double.toString(num1 + num2);
                       res += "\nDifference: " + Double.toString(num1 - num2);
                       res += "\nProduct: " + Double.toString(num1 * num2);
                       res += "\nQuotient: " + Double.toString(num1 / num2);}
        else{
            res += "\nSum: " + Double.toString(num1 + num2);
            res += "\nDifference: " + Double.toString(num1 - num2);
            res += "\nProduct: " + Double.toString(num1 * num2);
            res += "\nQuotient: " + "Error";}
        

        JOptionPane.showMessageDialog(null, res, "Result: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
    }

