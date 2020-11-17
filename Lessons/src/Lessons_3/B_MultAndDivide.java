package Lessons_3;
/* <----- Click this to Expand for Instructions
 * 
 * Exercise 3.2 - MULTIPLY AND DIVIDE
 * 
 * Variables can be manipulated and processed prior to being output.
 * 
 * In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill, 
 * and a variable called tax (the US tax rate), which represents the rate of tax to be added to the subtotal.
 * 
 * 1) Create a double variable, total, that holds subtotal plus the product of subtotal and tax. Print the total variable.
 * 
 * 2) There were 4 people who bought this meal together and want to split the cost. Create a double variable called perPerson that holds total divided by 4.
 * Print the perPerson variable!
 * 
 * CHALLENGE - The output displays 5 decimal places. Can you make it round to the nearest 2?
 */

import java.text.DecimalFormat;

public class B_MultAndDivide {
	
	private static DecimalFormat df = new DecimalFormat("0.00");
	
    public static void main(String[] args) {   
    	
        double subtotal = 30;
        double tax = 0.0875;
        
        double total = (subtotal * tax) + subtotal;
        
        System.out.println(total);
        
        double perPerson = total / 4;
        
        System.out.println(perPerson);
        
        System.out.println(df.format(perPerson));
    }
}