/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package driver;

import java.util.ArrayList;

import exception.StudentGradingException;
import util.FileIO;
import util.Statistics;
import util.Student;
import util.StudentGrade;

import java.io.*;

public class Driver2 {

	public static void main(String[] args) throws StudentGradingException, IOException {
		Student [] students = new Student[40];
		
		Statistics statistics = new Statistics();
		String filename = "C:\\Users\\Y Nhi\\eclipse-workspace\\Assignment6\\src\\Assignment6\\data.txt";
		
		try {
			students = FileIO.readFile(filename, students);
		} catch(StudentGradingException e) {
			e.writeToFile();
		}
		
		//Array list of student grade
		ArrayList<StudentGrade> studentGrades = new ArrayList<StudentGrade>();
		for(Student student: students) {
			if(student == null)
				break;
			studentGrades.add(new StudentGrade(student, statistics, students));
		}
		for(StudentGrade sg: studentGrades) {
			try	{
				FileIO.gradeWriter(sg);
				FileIO.gradeReader("Report_" + sg.getSID() + ".dat");
			} catch(StudentGradingException e) {
				e.writeToFile();
			}
		}
	}
}