/*
 * Kaia Mac
 * compares the square of the square root of any number
 * 18/02/2020
 */

package roundingerror.java;

import javax.swing.JOptionPane;

/**
 *
 * @author kamac8665
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double usernum;
        String myInput;
        myInput = JOptionPane.showInputDialog("Please enter a number: ");
        usernum = Double.parseDouble(myInput);
        double sqrt;
        sqrt = Math.sqrt(usernum);
        double square;
        square = sqrt*sqrt;
        System.out.println("The square of the square = " + square);
        double round;
        round = usernum - square;
        System.out.println("The round off error = " + round);
    }
    
}
