/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 5
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/21/2023
*/

package Assignment5;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
	
		Student lab5 [] = new Student[40];
		int num = 0;
		String file = "C:\\Users\\Y Nhi\\eclipse-workspace\\Assignment5\\src\\Assignment5\\";
		String name = " ";
		
		while (true) {
			Scanner input = new Scanner(System.in);
				System.out.print("Enter the file's name to analyze (no \'.txt\') or q to quit: ");
				name = input.next();
			
			//Exit the program if user enter q or Q
			if (name.equals("q")||name.equals("Q")) {
				System.out.print("Exited!\n");
				System.exit(0);
			}
			
			else if (name.equals("data.txt")) {
				System.out.println("You entered \'.txt\', please enter again without it!\n");
			}
			
			//If enter "data" (correct name of file), run the program
			else if (name.equals("data")){
				file += name + ".txt";
				
				//Populate the student array
				lab5 = Util.readFile(file, lab5);
				Statistics statlab5 = new Statistics();
				num = Util.counter;
				
				statlab5.findlow(lab5, num);

				//add calls to find high and find average
				statlab5.findhigh(lab5, num);
				statlab5.findavg(lab5, num);
				
				//Print the data and statistics
				System.out.printf("%8s %8s %8s %8s %8s %8s\n", "Stud", "Qu1", "Qu2", "Qu3", "Qu4", "Qu5");
				
				for(int i = 0; i < num; i++) {
					lab5[i].print();
				}
				System.out.print("\n");
				statlab5.printStatistics(lab5, num);
				System.out.print("\n");
			}
			
			//If user enter wrong file's name, show a message
			else
				System.out.printf("ERROR! %s is invalid file's name!\n\n", name);
				
		}
	}
}
