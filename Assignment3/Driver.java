/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 3
Due Date: Mon Feb 20, 2023 11:59pm
Date Submitted: 02/20/2023
*/

package Assignment3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String input1;
		int inputStore;
		boolean flag = true;
		//Original code
		//FileIO a1 = new FileIO("Z:\\JavaPrograms2\\assignment336b\\src\\Salesdat.txt");
			
		//Test run 1 - wrong file's location; it means we cannot open the file and it shows an error message
		//FileIO a1 = new FileIO ("Salesdat.txt");
		
		//The remain test runs
		//Call the file's path to open it
		FileIO a1 = new FileIO("C:\\Users\\Y Nhi\\eclipse-workspace\\Assignment3\\src\\Assignment3\\Salesdat.txt");
		Franchise f = a1.readData();
		while (flag) {
			System.out.print("\nEnter the number of the store (1 - 6) or q to quit: ");
			input1 = in.next();
			if (input1.equals("q")||input1.equals("Q")) {
				System.out.print("EXITED THE PROGRAM!\n");
				System.exit(0);
			}
			try {
				inputStore = Integer.parseInt(input1) ;
			} catch (Exception e) {
				System.out.printf("ERROR! %s is invalid option!\n", input1);
				continue;
			}
			if (inputStore < 0) {
				System.out.print("ERROR! Please enter positive option.\n");
			} else if (inputStore > 6 || inputStore == 0) {
				System.out.print("ERROR! Please enter number from 1 to 6 to choose the Store.\n");
			} else {
				if (inputStore == 1) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
				else if (inputStore == 2) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
				else if (inputStore == 3) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
				else if (inputStore == 4) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
				else if (inputStore == 5) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
				else if (inputStore == 6) {
					System.out.printf("       STORE %d", inputStore);
					Store s = f.getStores(inputStore - 1);
					s.AnalyzeResults();
				}
			}
		}
	}
}