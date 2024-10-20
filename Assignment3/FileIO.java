/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 3
Due Date: Mon Feb 20, 2023 11:59pm
Date Submitted: 02/20/2023
*/

package Assignment3;

import java.io.*;
import java.util.*;

public class FileIO {
	//Declare variables
	private String fname = null;
	private boolean DEBUG = true;
	
	//Constructor
	public FileIO(String fname) {
		this.fname = fname;
	}
	
	//Function to read data
	public Franchise readData() {
		//Declare and initialize
		Franchise a1 = null;
		int counter = 0;
		
		//Code adding for welcoming string
		System.out.print("WELCOME TO FRANCHISE APPLICATION");
		System.out.print("\nThe following lines will analyze the data in the \"Salesdata.txt\" file.\n");
		
		//Make try block
		try {
			//Declare file reader class to read from file
			FileReader file = new FileReader(fname);
			//Make buffering to read from the file
			BufferedReader buff = new BufferedReader(file);
			String temp;
			//Set end of file
			boolean eof = false;
			
			//Analyze the file by using while loop
			while (!eof) {
				//Assign
				String line = buff.readLine();
				//Increasing counter
				counter++;
				//Check if the line is null
				if (line == null)
					eof = true;
				
				//The line is not empty, do the commands
				else {
					//If DEBUG is true, print that line
					if (DEBUG)
						System.out.println("Reading " + line);
					
					//If counter == 1, convert line (string) into integer values
					if (counter == 1) {
						temp = line;
						//Set new Franchise
						a1 = new Franchise(Integer.parseInt(temp));
						
						//If the value can convert into integer (means DEBUG is true), print out
						//Here is the first line of the file, it shows the number of stores - 6 stores
						if (DEBUG)
							System.out.println("d  " + a1.NumberOfStores());
					}
					//If counter == 2, do nothing
					//Because 2nd line of the file is the line show day titles: Day1, Day2, ..., Day35
					if (counter == 2)
						;
					
					//If counter > 2, call the function buildStore || reading the data in the file
					if (counter > 2) {
						int x = buildStore(a1, (counter-3), line);
						 	
						//If DEBUG is true, print the number of store, the weeks of each store and its data
						if (DEBUG)
							System.out.println("\nReading Store # " + (counter-2) + " Number of weeks read =  " + x);
						
						if (DEBUG)
						{	
							System.out.println("Data read: ");							
							a1.getStores(counter-3).PrintData();
							System.out.print("\n");
							
						}                       
					}
				}
			}
			//Close the file
			buff.close();
			
		} catch (Exception e) { //catch block
			System.out.println("Error -- " + e.toString());
		}
		
		//return object of Franchise class
		return a1;
	}
	
	//buildStore function
	public int buildStore(Franchise a1, int counter, String temp) {
		//Declare and initialize
		Store tstore = new Store();
		String s1  =  "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp);
		
		//Loop through the entire line
	    while (st.hasMoreTokens()) {
	    	//Loop for each week
	        for(day=0;day<7;day++)
	        {
	        	s1 = st.nextToken();
	        	//Convert string s1 to float
		        sale = Float.parseFloat(s1);
		        //Call function SetSaleForWeekdayIntersection(week, day, sale)
	        	tstore.SetSaleForWeekdayIntersection(week, day, sale);
	        }
	        week++;
	    }
	    //Call function setStores
		a1.setStores(tstore, counter);
	    return week; 
	}
}
