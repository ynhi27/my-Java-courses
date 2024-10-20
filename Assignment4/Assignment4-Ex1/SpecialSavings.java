/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 1 - Part 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex1;

public class SpecialSavings extends SavingsAccount {

	public SpecialSavings(int accountNumber, double savingsBalance){
		super(accountNumber, savingsBalance);
	}
	
	public void calculateMonthlyInterest() {
		if (getSavingsBalance() > 10000) {
			modifyInterestRate(10);
		} else {
			modifyInterestRate(4); //Let default interest is 4%
		}
		super.calculateMonthlyInterest();
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount);
	}
	
	public void deposit(double amount) {
		super.deposit(amount);
	}
	
	public String toString() {
		return super.toString();
	}
}
