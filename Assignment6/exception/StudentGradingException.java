/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package exception;

import java.util.*;
import util.Student;
import java.io.*;

public class StudentGradingException extends Exception {
 
	private static final long serialVersionUID = 42L;
	private int errorNo;
	private String errorMsg;
	
	public StudentGradingException() {
		super();
		printmyproblem();
	}
	
	public StudentGradingException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
		printmyproblem();
	}

	public StudentGradingException(int errorNo) {
		super();
		this.errorNo = errorNo;
		printmyproblem();
	}
	
	public StudentGradingException(int errorNo, String errorMsg) {
		super();
		this.errorNo = errorNo;
		this.errorMsg = errorMsg;
		printmyproblem();
	}

	public int getErrorNo() {
		return errorNo;
	}

	public void setErrorNo(int errorNo) {
		this.errorNo = errorNo;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public void printmyproblem() {
		System.out.println("StudentGradingException [error number: " + errorNo + ", error message: " + errorMsg);
	}
	
	public int fixProblemReadFromConsole(Student[] lab6, int i) {
		
		System.out.print("Enter SID and 5 scores seperated by space, then enter a new SID on the next line.");
		Scanner input = new Scanner("data.txt");
		int a = Integer.parseInt(input.next());
		lab6[i].setSID(a);
		int scores[] = new int[5];
		for (int j = 0; j < 5; j++) {
			scores[j] = Integer.parseInt(input.next());
		}
		lab6[i].setScores(scores);
		input.close();
		return a;
	}

	public void writeToFile() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("filepath.txt", true));
			bw.append(errorMsg);
			bw.close();
			bw.newLine();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
