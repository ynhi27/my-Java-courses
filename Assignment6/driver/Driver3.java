/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package driver;

import java.io.*;
import java.util.*;

import Assignment6.StudentAPI;
import Assignment6.StudentAPIImpl;
import exception.StudentGradingException;
import util.FileIO;
import util.Statistics;
import util.Student;
import util.StudentGrade;

public class Driver3 {

	public static void main(String[] args) throws StudentGradingException, IOException{
	
		//Create new object of students
		Student [] students = new Student[40];
		
		//Create new object of class statistics
		Statistics statistics = new Statistics();
		//File path
		String filename = "C:\\Users\\Y Nhi\\eclipse-workspace\\Assignment6\\src\\Assignment6\\data.txt";
		
		//Create new object of student API
		StudentAPI studentAPI = new StudentAPIImpl();
		
		try {
			students = FileIO.readFile(filename, students);
		} catch(StudentGradingException exception) {
			exception.writeToFile();
		}
		
		
		//Array list of student grade
		ArrayList<StudentGrade> grades = new ArrayList<StudentGrade>();
		for(Student student: students) {
			if(student == null)
				break;
			grades.add(new StudentGrade(student, statistics, students));
		}
		for(StudentGrade studentGrade: grades) {
			try {
				FileIO.gradeWriter(studentGrade);
				FileIO.gradeReader("Report_" + studentGrade.getSID() + ".dat");
			} catch(StudentGradingException e) {
				e.writeToFile();
			}
		}
		
		//Ask input from user to see which SID
		Scanner in = new Scanner(System.in);
		
		String input;
		int number;
		
		//This loop helps program run again and again until user want to quit
		while (true) {
			System.out.print("\nEnter a SID or q to quit: ");
			input = in.next();
			
			//User type q or Q to exit the program
			if (input.equals("q")||input.equals("Q")) {
				System.out.print("Exited!\n");
				break;
			}
			
			//Show an error message when user enter non-numeric value
			try {
				number = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.printf("ERROR! %s is invalid SID!\n", input);
				continue;
			}
			
			//Print the score of student that user enter SID, if number has '-' sign, show a message
			if (number < 0) {
				System.out.println("ERROR! Please delete the minus sign.\n");		
			} else {
				studentAPI.printStatistics(number);
				studentAPI.printScore(number);
			}
		}
		in.close();
	}

}
