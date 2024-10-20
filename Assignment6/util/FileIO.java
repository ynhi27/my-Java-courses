/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 6
Due Date: Fri Mar 24, 2023 11:59pm
Date Submitted: 03/23/2023
*/

package util;

import java.io.*;
import java.util.*;

import exception.StudentGradingException;

public class FileIO {

	private static int counter;
	private static String header;
	
	public FileIO() {
		counter = 0;
		header = "";
	}
	
	public static int getCounter() {
		return FileIO.counter;
	}
	
	public static String getHeader() {
		return FileIO.header;
	}
	
	//Method to read the data from the file
	public static Student[] readFile(String filename, Student[] students) throws StudentGradingException {
	
		try {
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		boolean eof = false;
		
		while (!eof) {
			String line = bufferedReader.readLine();
			
			if (line == null)
				eof = true;
			else {
				counter++;
			
				if (counter == 1) {
					header = line;
				}
				
				if (counter > 1) {
					students[counter - 2] = new Student();
					StringTokenizer st = new StringTokenizer(line);
					while (st.hasMoreTokens()) {
						students[counter - 2].setSID(Integer.parseInt(st.nextToken()));
						
						int[] score = new int[5]; // stores scores
						
						for (int j = 0; j < 5; j++) {
							score[j] = Integer.parseInt(st.nextToken());
						}
						
						students[counter - 2].setScores(score);
					}
				}
				
				if(counter > 40)
					break;
				}
			}
			bufferedReader.close();
		} catch(NumberFormatException exception) {
			throw new StudentGradingException(101, "NumberFormatException");
		} catch(Exception exception) {
			throw new StudentGradingException(404, exception.toString());
		}
		
		return students;
	}
	
	//Method for grade writer
	public static void gradeWriter(StudentGrade studentGrade) throws StudentGradingException, IOException {
		ObjectOutputStream objectOutputStream = null;
		try {
			String filename = "Report_" + studentGrade.getSID() + ".dat";
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
			System.out.println("Created file: " + filename);
			objectOutputStream.writeObject(studentGrade);
		} catch(IOException e) {
			if(objectOutputStream!= null)
				objectOutputStream.close();
			throw new StudentGradingException(202, e.toString());
		}
		if(objectOutputStream!= null)
			objectOutputStream.close();
	}
	
	
	//Method for grade reader
	public static StudentGrade gradeReader(String filename) throws StudentGradingException, IOException {
		ObjectInputStream objectInputStream;
		StudentGrade studentGrade;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(filename));
		} catch(FileNotFoundException exception) {
			throw new StudentGradingException(01, exception.toString());
		} catch(IOException exception) {
			throw new StudentGradingException(02, exception.toString());
		}
		
		try {
			studentGrade = (StudentGrade)objectInputStream.readObject();
		} catch(ClassNotFoundException exception) {
			objectInputStream.close();
			throw new StudentGradingException(03, exception.toString());
		}
		objectInputStream.close();
		return studentGrade;
	}
}
