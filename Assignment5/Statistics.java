/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 5
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/21/2023
*/

package Assignment5;

class Statistics {

	int [] lowscores = new int [5];
	int [] highscores = new int [5];
	float [] avgscores = new float [5];

	void findlow(Student [] a, int d) {
	/* This method will find the lowest score and store it in an array names lowscores. */
		for (int i = 0; i < lowscores.length; i++) {
			int[] temp = a[0].getScores();
			int low = temp[i];
			
			for (int k = 0; k < d; k++) {
				int[] studentScores = a[k].getScores();
				if (low > studentScores[i]) {
					low = studentScores[i]; 
				}
			}
			lowscores[i] = low;
		}
	}
	
	void findhigh(Student [] a, int d) {
	/* This method will find the highest score and store it in an array names highscores. */
		for (int i = 0; i < highscores.length; i++) {
			int[] temp = a[0].getScores();
			int high = temp[i];
			
			for (int k = 0; k < d; k++) {
				int[] studentScores = a[k].getScores();
				if (high < studentScores[i]) {
					high = studentScores[i]; 
				}
			}
			highscores[i] = high;
		}
	}

	void findavg(Student [] a, int d) {
	/* This method will find avg score for each quiz and store it in an array names avgscores. */
		for (int i = 0; i < avgscores.length; i++) {
			float total = 0;
			for (int k = 0; k < d; k++) {
				int[] studentScores = a[k].getScores();
				total += studentScores[i];
			}
			avgscores[i] = total / d; 
		}
	}
	
	//add methods to print values of instance variables.
	public void printStatistics(Student [] a, int d) {
		System.out.printf("%s %5d %8d %8d %8d %8d\n", "High Scores", highscores[0], highscores[1],
				highscores[2], highscores[3], highscores[4]);
		System.out.printf("%s %6d %8d %8d %8d %8d\n", "Low Scores", lowscores[0], lowscores[1],
				lowscores[2], lowscores[3], lowscores[4]);
		System.out.printf("%s %12.2f %8.2f %8.2f %8.2f %8.2f\n", "Average", avgscores[0], avgscores[1],
				avgscores[2], avgscores[3], avgscores[4]);
	}
}	
