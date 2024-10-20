/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package Assignment6;

import java.io.*;
import exception.StudentGradingException;
import util.FileIO;
import util.StudentGrade;

public class StudentAPIImpl implements StudentAPI {

	//Method to print statistics
	public void printStatistics(int SID) {
		String filename = "Report_" + SID + ".dat";
		StudentGrade studentGrade;
		try {
			studentGrade = FileIO.gradeReader(filename);
			studentGrade.printStatistics();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Method to print score
	public void printScore(int SID) {
		String filename = "Report_" + SID + ".dat";
		StudentGrade studentGrade;
		try {
			studentGrade = FileIO.gradeReader(filename);
			System.out.printf("Scores for %d: ", SID);
			for(int i = 0; i < 5; i++) {
				System.out.printf(studentGrade.getStudents().getScores()[i] + " ");
			}
			System.out.println();
		} catch(IOException exception) {
			
		} catch(StudentGradingException exception) {
			System.out.println(exception.toString());
		}
	}

}
