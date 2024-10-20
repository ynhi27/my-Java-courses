/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 2 - Part 1
Due Date: Mon Feb 6, 2023 11:59pm
Date Submitted: 02/04/2023
*/

package Part1;

import java.util.Scanner;

public class GetInput {
	//This class take inputs from user with error messages for wrong type inputs.
	public void UserInput(PersonalInformation p) {
		Scanner input = new Scanner(System.in);
		
		String userName, 			//User's name
			   userAdd, 			//User's address
			   userAge, 			//User's age
			   userPhone, 			//User's phone number raw input
			   phone, 				//User's phone number format
			   phoneF;				//User's phone number after format
		int age;					//User's age after changing into integer type
		boolean flag = true, check;	//Conditions for showing errors message
		
		System.out.print("\nWhat is your name? ");
		userName = input.nextLine();
		p.setName(userName);
			
		System.out.print("What is your address? ");
		userAdd = input.nextLine();
		p.setAddress(userAdd);
		
		while (flag) {	
			System.out.print("How old are you? ");
			userAge = input.nextLine();

			// Show an error message when user enter a string or negative number
			try {
				age = Integer.parseInt(userAge);
			} catch (Exception e) {
				System.out.printf("ERROR! %s is invalid value!\n", userAge);
				continue;
			}
			
			if (age < 0) {
				System.out.println("Error! You entered negative age.");
			} else {
				p.setAge(age);
				break;
			}
		}
			
		while (flag) {
			phone = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
			System.out.print("Enter your 10-digit phone number: ");
			userPhone = input.nextLine();
			check = userPhone.matches(phone);
			
			//Show an error message when user enter wrong format of value (10-digit)
			if (!check) {
				System.out.println("Error! You were not entered 10-digit phone number.");
			} else {
				//Format the string userPhone to print out with (xxx) xxx-xxxx
				phoneF = userPhone.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
				p.setPhoneNumber(phoneF);
				break;
			}
		}
		
	}
}
