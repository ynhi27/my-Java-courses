/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package util;

import java.io.*;

public class Statistics implements Serializable {
	
	private static final long serialVersionUID = 42L;
	int [] lowscores = new int [5];
	int [] highscores = new int [5];
	float [] avgscores = new float [5];
	
	public Statistics() {
	}

	public int[] getLow() {
		return lowscores;
	}

	public int[] getHigh() {
		return highscores;
	}

	public float[] getAverage() {
		return avgscores;
	}
	
	//Method to finD the lowest score
	public void findLow(Student[] a) {

		int temp[] = a[0].getScores();
		int min;
		int track[];
		for (int i = 0; i < 5; i++) {
			min = temp[i];
			for (int j = 0; j < (FileIO.getCounter() - 1); j++) {
				track = a[j].getScores();
				if (min > track[i])
					min = track[i];
				}
			this.lowscores[i] = min;
		}
	}

	//Method to find highest score
	public void findHigh(Student[] a) {

		int temp[] = a[0].getScores();
		int max;
		int track[];
		for (int i = 0; i < 5; i++) {
			max = temp[i];
	
		for (int j = 0; j < FileIO.getCounter() - 1; j++) {
			track = a[j].getScores();
			if (max < track[i])
				max = track[i];
			}
			this.highscores[i] = max;
		}

	}

	//Method to calculate average score
	public void findAverage(Student[] a) {

		float total;
		int track[];
		for (int i = 0; i < 5; i++) {
			total = 0;
	
			for (int j = 0; j < FileIO.getCounter() - 1; j++) {
				track = a[j].getScores();
				total += track[i];
			}
			this.avgscores[i] = total / (FileIO.getCounter() - 1);
	
		}
	}

	//Print methods	
	public void printStatistics(Student [] a) {
		System.out.printf("%s %5d %8d %8d %8d %8d\n", "High Scores", highscores[0], highscores[1],
				highscores[2], highscores[3], highscores[4]);
		System.out.printf("%s %6d %8d %8d %8d %8d\n", "Low Scores", lowscores[0], lowscores[1],
				lowscores[2], lowscores[3], lowscores[4]);
		System.out.printf("%s %12.2f %8.2f %8.2f %8.2f %8.2f\n", "Average", avgscores[0], avgscores[1],
				avgscores[2], avgscores[3], avgscores[4]);
	}
	
	public void printStatistics(int[] scores) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%9d", scores[i]);
		}

		System.out.printf("\n");
	}
	
	public void printStatistics(float[] scores) {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%9.2f", scores[i]);
		}

		System.out.printf("\n");
	}
}	
