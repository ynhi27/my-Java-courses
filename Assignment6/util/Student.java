/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package util;

import java.io.*;

public class Student implements Serializable {

	private static final long serialVersionUID = 42L;
	private int SID;
	private int scores[] = new int[5];
	
	public Student() {
		SID = 0;
		scores = null;
	}
	
	public int getSID() {
		return SID;
	}
	
	public int[] getScores() {
		return scores;
	}
	
	public void setSID(int SID) {
		this.SID = SID;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void print() {
		System.out.printf("%8d", SID);
	
		for (int i = 0; i < 5; i++) {
			System.out.printf("%9d", scores[i]);
		}
		
		System.out.printf("\n");
	}
}
