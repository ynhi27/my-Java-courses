/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 4 - Exercise 1 - Part 2
Due Date: Mon Mar 13, 2023 11:59pm
Date Submitted: 03/07/2023
*/

package Assignment4Ex1;

public class SpecialSavingsDriver {

	public static void main(String[] args) {
		//Create saver1
		SpecialSavings saver1 = new SpecialSavings(123456, 2000.00);
		//Create saver2
		SpecialSavings saver2 = new SpecialSavings(987654, 3000.00);
		
		System.out.println("SpecialSavings part:");
		
		System.out.println("---First account---");
		saver1.deposit(1000);
		saver1.calculateMonthlyInterest();	//Default interest 4%
		System.out.println(saver1);
		saver1.deposit(5000);
		saver1.calculateMonthlyInterest();	//Interest 10%
		System.out.println(saver1);
		
		System.out.println("---Second account---");
		saver2.deposit(1000);
		saver2.calculateMonthlyInterest();	//Default interest 4%
		System.out.println(saver2);
		saver2.deposit(5000);
		saver2.calculateMonthlyInterest();	//Interest 10%
		System.out.println(saver2);
	}
}
