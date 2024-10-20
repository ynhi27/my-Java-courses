/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package driver;

import java.util.Scanner;

import exception.StudentGradingException;
import util.FileIO;
import util.Statistics;
import util.Student;

public class Driver1 {
	public static void main(String[] args) throws StudentGradingException {
		
		String file = "C:\\Users\\Y Nhi\\eclipse-workspace\\Assignment6\\src\\Assignment6\\";
		String name = " ";
		
		//Create new object of students
		Student lab6[] = new Student[40];

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
				System.out.println("You entered \'.txt\', please enter \"data\" without \'.txt\'!\n");
			}
			
			//If enter "data" (correct name of file), run the program
			else if (name.equals("data")){
				file += name + ".txt";
				try {
					FileIO.readFile(file, lab6);
				}
				
				//Student Grading Exception
				catch(StudentGradingException exception) {
					if(exception.getErrorMsg() == "NumberFormatException") {
						exception.fixProblemReadFromConsole(lab6, FileIO.getCounter() - 2);
					}
					exception.writeToFile();
				}

				if(FileIO.getCounter() == 0) {
					System.out.println("File is empty!");
					break;
				}

				if(FileIO.getCounter() == 1) {
					System.out.println("No student data in file!");
					break;
				}
				//Print the data and statistics
				System.out.printf("%8s %8s %8s %8s %8s %8s\n", "Stud", "Qu1", "Qu2", "Qu3", "Qu4", "Qu5");
				for(int i = 0; i < (FileIO.getCounter() - 1); i++) {
					lab6[i].print();
				}

				//Create new object of statistics
				Statistics statlab6 = new Statistics();

				statlab6.findLow(lab6);
				statlab6.findHigh(lab6);
				statlab6.findAverage(lab6);
				
				//Print the statistics
				System.out.print("\n");
				statlab6.printStatistics(lab6);
				System.out.print("\n");
			}
			
			
			//If user enter wrong file's name, show a message
			else
				System.out.printf("ERROR! %s is invalid file's name!\n\n", name);
				
		}
	}
}