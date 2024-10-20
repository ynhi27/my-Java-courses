/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 1
Due Date: Mon Jan 23, 2023 11:59pm
Date Submitted: 01/18/2023
*/

package Problem6_22;

import java.util.Scanner;

public class SquareRoot {
	
	// Main method
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input;
		double number;
		
		// This loop helps program run again and again until user want to quit
		while (true) {
			System.out.print("Enter an integer or q to quit: ");
			input = in.next();
			
			// User type q or Q to exit the program
			if (input.equals("q")||input.equals("Q")) {
				System.out.print("Exiting....\n");
				break;
			}
			
			// Show an error message when user enter non-numeric value
			try {
				number = Double.parseDouble(input);
			} catch (Exception e) {
				System.out.printf("ERROR! %s is invalid value!\n\n", input);
				continue;
			}
			
			// Show the square root if input value larger than 0, if not show a message
			if (number < 0) {
				System.out.println("Error! Please enter a positive number.\n");		
			} else {
				System.out.print("The approximate square root of " + number + " is: " + sqrt(number));
				System.out.print("\n\n");
			}
		}
		in.close();
	}

	
	// Calculate square root
	public static double sqrt(double n) {
		double lastGuess = 1,
			   nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while(Math.abs(lastGuess - nextGuess) >= 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
	}
}
