/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 1 - Part 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex1;

import java.util.Date;

public class SavingsAccount {

	private double savingsBalance;
	private static double annualInterestRate = 0;
	private int accountNumber;
	private Date dateCreated;
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;	
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest() {
		savingsBalance += savingsBalance * (annualInterestRate / 1200);
	}
	
	public static void modifyInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	
	//More functions for Part 2 of Exercise 1
	public SavingsAccount(int accountNumber, double savingsBalance) {
		this.savingsBalance = savingsBalance;
		this.accountNumber = accountNumber;
		this.dateCreated = new Date();
	}
	
	public void withdraw(double amount) {
		savingsBalance -= amount;
	}
	
	public void deposit (double amount) {
		savingsBalance += amount;
	}
	
	protected int getAccountNumber() {
		return accountNumber;
	}
	
	protected void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String toString() {
		return "Account infomation: \nAccount number: " + accountNumber + "\nBalance: $" + Math.round(savingsBalance * 100.0) /100.0 + "\nDate created: " + dateCreated + "\n";
	}
}
