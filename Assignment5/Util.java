/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 5
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/21/2023
*/

package Assignment5;

import java.io.*;
import java.util.StringTokenizer;

class Util {

	static int counter;

	static Student [] readFile(String filename, Student [] stu) {
		int i = 0;
		
		//Reads the file and builds student array.
		try {
			//Open the file using FileReader Object.
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			
			boolean eof = false;
			
			//Read the first line - the title
			buff.readLine();
			
			//In a loop read a line using readLine method.
			while (!eof) {
				String line = buff.readLine();
				
				if (line == null)
					eof = true;
				
				// Skip blank lines
				else if (line.trim().length() == 0)
				    continue;
				
				else {
					stu[i] = new Student();
					StringTokenizer string_int = new StringTokenizer(line);
					
					while (string_int.hasMoreTokens()) {
						stu[i].setSID(Integer.parseInt(string_int.nextToken())); 
					    
					    int[] array = new int[5];
					    
					    for (int j = 0; j < 5; j++) {
					    	array[j] = Integer.parseInt(string_int.nextToken());
					    }
					    stu[i].setScores(array);
					}
				}
				i++;
           }
           buff.close();
        } catch (IOException e) {
           System.out.println("Error -- " + e.toString());
        }
		
		counter = i - 1;
		return stu;
   }
}
