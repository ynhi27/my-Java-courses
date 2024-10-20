/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 1 - Part 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex1;

public class SavingAccountDriver {

	public static void main(String[] args) {
		//Create saver1
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		//Create saver2
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		System.out.println("Set annual interest rate to 4%, then calculate the monthly interest");
		SavingsAccount.modifyInterestRate(4);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1: " + saver1.getSavingsBalance());
		System.out.println("Saver2: " + saver2.getSavingsBalance());
		
		System.out.println("Set annual interest rate to 5%, then calculate the monthly interest");
		SavingsAccount.modifyInterestRate(5);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Saver1: " + saver1.getSavingsBalance());
		System.out.println("Saver2: " + saver2.getSavingsBalance());		
	}
}
