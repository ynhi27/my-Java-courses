/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package util;

import java.io.*;

public class StudentGrade implements Serializable {


	private static final long serialVersionUID = 42L;
	
	//Students
	private Student students;
	//Statistics
	private Statistics statistics;
	//Array of student
	private Student[] student;
	
	//Constructor for the students
	public StudentGrade(Student students, Statistics statistics, Student[] student) {
		this.students = students;
		this.statistics = statistics;
		this.student = student;
	}
	
	public Student getStudents() {
		return students;
	}
	
	public void setStudents(Student students) {
		this.students = students;
	}
	
	public Statistics getStatistics() {
		return statistics;
	}
	
	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}
	
	public Student[] getStudent() {
		return student;
	}
	
	public void setStudent(Student[] student) {
		this.student = student;
	}
	
	public int getSID() {
		return students.getSID();
	}
	
	//Method to print highest score
	public void printHighest() {
		System.out.printf("Highest:");
		statistics.findHigh(student);
		statistics.printStatistics(statistics.getHigh());
	}
	
	//Method to print lowest score
	public void printLowest() {
		System.out.printf("Lowest: ");
		statistics.findLow(student);
		statistics.printStatistics(statistics.getLow());
	}
	
	//Method to calculate average score
	public void printAverage() {
		System.out.printf("Average:   ");
		statistics.findAverage(student);
		statistics.printStatistics(statistics.getAverage());
	}
	
	
	//Method to print statistics
	public void printStatistics() {
		System.out.println("The statistics of class:");;
		printHighest();
		printLowest();
		printAverage();
	}
	
	//Method to print score
	public void printScores() {
		for(int i = 0; i < 5; i++) {
			System.out.printf(students.getScores()[i] + " ");
		}
	}
	
	//Method to print all scores
	public void printAllScores() {
		for(int i = 0; i < 40; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf(student[i].getScores()[j] + "\t");
			}
		System.out.println();
		}
	}
}
