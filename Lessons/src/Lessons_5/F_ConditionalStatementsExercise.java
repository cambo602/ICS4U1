package Lessons_5;
/* <----- Click this to Expand for Instructions
 * 
 * Exercise 5.6 - REVIEW - LOGIN SCREEN
 * 
 * 
 * Task - Create a simple login screen that prompts the user for their Username and Password, and if they are 'correct' tell them they have 
 * logged in successfully, and if not, tell them that they are incorrect and to try again. 
 * 
 * This exercise is possible with some clever use of a For loop, but it's much easier with a 'while' loop. This is a simpler type of loop 
 * that does not have a counter. It can be controlled with any true/false condition (so think of making a boolean value to check if the 
 * condition is correct).
 * 
 * HINT - Remember, String is not a primitive data type so you will need to use the .Equals() (See Exercise 3.7).
 * 
 * BONUS - have more than one valid username/password combination
 * BONUS - if the user types Quit, have the program loop terminate (stop running).
 * 
 */

import java.util.Scanner;

public class F_ConditionalStatementsExercise {
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        boolean loggedIn = false; 
    	while(!loggedIn){
    		System.out.println("Username: ");
    		String user = input.nextLine();
    		System.out.println("Password: ");
    		String pass = input.nextLine();
    		int length = pass.length();
    		for(int i = 0; i < length; i++) {
    		 System.out.print("*");	
    		}
    		if(user.equals("admin") && pass.equals("admin")) {
    			System.out.println("\nAccess Granted");
    			loggedIn = true;
    		}else if (user.equals("Mr. P") && pass.equals("pong")) {
    			System.out.println("\nAccess Granted");
    			loggedIn = true;
    		}else {
    			System.out.print("\nUsername/Password are incorrect");
    			System.out.println("\n");
    		}
    	}
    }
}
