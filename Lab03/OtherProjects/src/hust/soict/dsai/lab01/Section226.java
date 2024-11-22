package hust.soict.dsai.lab01;

import javax.swing.JOptionPane;
public class Section226 {
    public static void main(String[] args) {
    String[] possibilities = { "First-degree equation, 1 variable" ,"Linear system, 2 variables", "Second-order equation, 1 variable"};
    String type = (String) JOptionPane.showInputDialog(null, "Select type of equation:\n ",null, JOptionPane.PLAIN_MESSAGE, null, possibilities, null);
    if (type.equals("First-degree equation, 1 variable")){
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "ax + b = 0 \nValue of a: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "ax + b = 0 \nValue of b: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        if(a == 0){
            JOptionPane.showMessageDialog(null, " ", type, JOptionPane.ERROR_MESSAGE);}
        else{
            double res = (- b / a);
            JOptionPane.showMessageDialog(null, "value of x is " + res, "Result", JOptionPane.INFORMATION_MESSAGE);}
        }
    else if (type.equals("Linear system, 2 variables")){
        double a11, a12, a21, a22, b1, b2;
        
        a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "a11 1x + a12 x2 = b1 \na21 x1 + a22 x2 = b2 \nValue of a11: ", "Input", JOptionPane. INFORMATION_MESSAGE));
        a12 = Integer.parseInt(JOptionPane.showInputDialog(null, "a11 x1 + a12 x2 = b1\na21 x1 + a22 x2 = b2\nValue of a12: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        b1 = Integer.parseInt(JOptionPane.showInputDialog(null, "a11 x1 + a12 x2 = b1\na21 x1 + a22 x2 = b2\nValue of b1: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        a21 = Integer.parseInt(JOptionPane.showInputDialog(null, "a11 x1 + a12 x2 = b1\na21 x1 + a22 x2 = b2\nValue of a21: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        a22 = Integer.parseInt(JOptionPane.showInputDialog(null, "a11 x1 + a12 x2 = b1\na21 x1 + a22 x2 = b2\nValue of a22: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        b2 = Integer.parseInt(JOptionPane.showInputDialog(null, "a11 x1 + a12 x2 = b1\na21 x1 + a22 x2 = b2\nValue of b2: ", "Input", JOptionPane.INFORMATION_MESSAGE));
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        double x1 = D1 / D;
        double x2 = D2 / D;
        if ((a11 == 0 && a12 == 0) || (a21 == 0 && a22 == 0)){
            JOptionPane.showMessageDialog(null, "Invalid coefficients", "Error", JOptionPane.ERROR_MESSAGE);}
        else if (a11 * a22 == a12 * a21){
            if (a12 * b2 != a21 * b1){
                JOptionPane.showMessageDialog(null, "System has no solutions", "Results", JOptionPane.INFORMATION_MESSAGE);}
            else{
                JOptionPane.showMessageDialog(null, "System has infinite solutions", "Results", JOptionPane.INFORMATION_MESSAGE);}
        }
        else{
            JOptionPane.showMessageDialog(null, "x1= " + x1 +", " + "x2= " + x2, "Results", JOptionPane.INFORMATION_MESSAGE);}
        }


    	else if (type.equals("Second-order equation, 1 variable")){
    		double a, b, c;
    		a = Double.parseDouble (JOptionPane.showInputDialog(null, "ax^2 + bx +c = 0 \nValue of a: ", "Input", JOptionPane. INFORMATION_MESSAGE));
    		b = Double.parseDouble(JOptionPane.showInputDialog(null, "ax^2 + bx +c = 0 \nValue of b: ", "Input", JOptionPane. INFORMATION_MESSAGE));
    		c = Double.parseDouble(JOptionPane.showInputDialog(null, "ax^2 + bx + c = 0 \nValue of c: ", "Input", JOptionPane. INFORMATION_MESSAGE));
    	if (a == 0){
    		JOptionPane.showMessageDialog(null, "Invalid value of a", "Error", JOptionPane.ERROR_MESSAGE);
    	}else{
    		double delta = b*b - 4*a*c;
    		double x1 = (b+ Math.sqrt(delta)) / (2 * a);
    		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
    		if (delta < 0){
    			JOptionPane.showMessageDialog(null, "Equation has no solutions", "Results", JOptionPane.INFORMATION_MESSAGE);
    		}else if (delta == 0){
    			JOptionPane.showMessageDialog(null, "Equation has a double root: x = " + x1, "Results", JOptionPane.INFORMATION_MESSAGE);
    		}else if (delta>0) {
    			JOptionPane.showMessageDialog(null, "Equation has two single roots: x1 = " + x1 + ", " + "x2 = " + x2, "Results", JOptionPane.INFORMATION_MESSAGE);
    		}
    	}
    }
    System.exit(0);
    }
}
    				


    


