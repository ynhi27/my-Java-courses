/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 5
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/21/2023
*/

package Assignment5;

class Student {
	
	private int SID;
	private int scores[] = new int[5];
	
	//write public get and set methods for SID and scores
	public int getSID() {
		return this.SID;
	}
	
	public void setSID(int sID) {
		this.SID = sID;
	}

	public int[] getScores() {
		return this.scores;
	}
	
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	//add methods to print values of instance variables.
	public void print() {
		System.out.printf("%8d %8d %8d %8d %8d %8d\n",
				SID, scores[0], scores[1], scores[2], scores[3], scores[4]);
	}	
}
