/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 1
Due Date: Mon Jan 23, 2023 11:59pm
Date Submitted: 01/18/2023
*/

package Problem5_22;

import java.util.Scanner;

public class LoanSchedule {
	
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner in = new Scanner(System.in);
			
		// Declare variables
		String input1, input2, input3;
			
		double loanAmount,				//Loan amount
			   annualInterestRate,		//Annual interest rate
			   monthlyInterestRate,		//Monthly interest rate
			   totalMonthlyPayment,		//Total payment every month
			   totalPayment,			//Total payment for the whole loan
			   balance,					//Loan amount after each installment
			   numberOfYear,			//Number of years
			   numberOfInstallments;	//Number of installments (or number of months)
			
			
		/** Prompt the user input of loan amount, number of years, and annual interest rate */
		while (true) {
			System.out.println("Enter values below, or q to quit program:");
			System.out.print("Loan Amount: ");
			input1 = in.next();
			OutProgram(input1);
				
			System.out.print("Number of Years: ");
			input2 = in.next();
			OutProgram(input2);
				
			System.out.print("Annual Interest Rate: ");
			input3 = in.next();
			OutProgram(input3);
				
			// Show an error message when user enter non-numeric value
			try {
				loanAmount = Double.parseDouble(input1);
				numberOfYear = Integer.parseInt(input2);				
				annualInterestRate = Double.parseDouble(input3);
			} catch (Exception e) {
				System.out.printf("ERROR! %s, %s, %s are invalid value!\n\n", input1, input2, input3);
				continue;
			}
					
			// Calculate total monthly payment
			if (loanAmount < 0 || numberOfYear < 0 || annualInterestRate < 0) {
				System.out.println("Error! Please enter positive values.\n");
			} else {
				monthlyInterestRate = (annualInterestRate / 100) / 12;
				numberOfInstallments = numberOfYear * 12;
				totalMonthlyPayment = MonthlyPayment(loanAmount, numberOfInstallments, monthlyInterestRate);
				
				// Calculate total payment
				totalPayment = totalMonthlyPayment * numberOfInstallments;
				
				// Display payments on the screen
				System.out.printf("\nMonthly Payment: %.2f", totalMonthlyPayment);
				System.out.printf("\nTotal Payment: %.2f\n\n", totalPayment);
				
				// Display Monthly Amortization Schedule
				System.out.printf("%-16s%-16s%-16s%-16s\n", "Payment#", "Interest", "Principal", "Balance");
				balance = loanAmount;
				for (int i = 1; i <= numberOfYear * 12; i++) {
					double interest = monthlyInterestRate * balance;
					double principal = totalMonthlyPayment - interest;
					balance = balance - principal;
					System.out.printf("%-10d%11.2f%17.2f%17.2f\n", i, interest, principal, balance);
				}
				System.out.print("\n");
			}
		}
	}
		
	/** Calculate monthly payment*/
	public static double MonthlyPayment(double loanAmount, double loanTime, double interestRate) {
		
		double monthlyPay;
		
		monthlyPay = (loanAmount * interestRate * Math.pow(1 + interestRate, loanTime))
				/ (Math.pow(1 + interestRate, loanTime) - 1);
		
		return monthlyPay;
	}
	
	/** Enter q or Q to exit the program*/
	public static String OutProgram(String userInput) {
		if (userInput.equals("q")||userInput.equals("Q")) {
			System.out.print("Exiting....\n");
			System.exit(0);
		}		
		return userInput;
	}
}
