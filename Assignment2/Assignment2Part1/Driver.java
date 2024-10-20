/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 2 - Part 1
Due Date: Mon Feb 6, 2023 11:59pm
Date Submitted: 02/04/2023
*/

package Part1;
	
public class Driver {	
	public static void main(String[] args) {
		//This is main program
		System.out.print("This program will ask you to enter 3 people's information.\n");
		
		GetInput g = new GetInput();
		
		PersonalInformation a = new PersonalInformation();
		g.UserInput(a);
		
		PersonalInformation b = new PersonalInformation();
		g.UserInput(b);
		
		PersonalInformation c = new PersonalInformation();
		g.UserInput(c);
		
		a.print();
		b.print();
		c.print();	
	}
}

