package Lessons_5;
/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.4 - USER INPUT WITH LOOPS - Solution
 * 
 * Here is the solution in case you need assistance - give 5.3 an honest effort before looking at this solution.
 * 
 * Change the loop so that it counts backwards from the user input value until 1.
 * 
 */

import java.util.Scanner; //Import the Scanner here

public class D_UserUserInputWithLoopsSolution {
    
    public static void main(String[] args) {
        //Create an object in the Scanner Class
        Scanner myObj = new Scanner(System.in);    
        //Prompt the user for a number
        System.out.println("Enter a number:");
        //Use Scanner to store the next Integer the user enters in a variable
        int upperBound = myObj.nextInt();
        for(int i = 1; i <= upperBound; i++){     //Note that we needed to use upperBound in the 'condition' part of the loop    
            System.out.println("The value of i is: "+i);
        }
    }
}