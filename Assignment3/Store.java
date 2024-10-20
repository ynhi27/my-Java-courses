/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 3
Due Date: Mon Feb 20, 2023 11:59pm
Date Submitted: 02/20/2023
*/

package Assignment3;

import java.util.*;

public class Store {
	//Declare array of type float to stores sale data
	private float salesbyweek[][];
	
	//Constructor
	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// setsaleforweekdayintersection(int week, int day, float sale)
	public void SetSaleForWeekdayIntersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}
	
	//Function printdata() prints data sales week by week
	public void PrintData() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	// float [] getsalesforentireweek(int week)
	float[] GetSalesForEntireWeek(int week) {
		float[] sale = new float[7];
		for (int j = 0; j < 7; j++) {
			sale[j] = salesbyweek[week][j];
		}
		return sale;
	}
	// float getsaleforweekdayintersection(int week, int day)
	float GetSaleForWeekdayIntersection(int week, int day) {
		return salesbyweek[week][day];
	}
	
	// businessmethod
	// a. totalsalesforweek
	float TotalSalesForWeek(int week) {
		float total = 0;
		
		//Loop through the sales data for each store
		for (int j = 0; j < 7; j++) {
			//Using loop to sum the total sales
			total += salesbyweek[week][j];
		}
		return total;
	}
	
	// b. avgsalesforweek
	float AvgSalesForWeek(int week) {
		return TotalSalesForWeek(week) / 7;
	}
	
	// c. totalsalesforallweeks
	float TotalSalesForAllWeeks() {
		float total = 0;
		for (int i = 0; i < 5; i++) {
			total += TotalSalesForWeek(i);
		}
		return total;
	}
	
	// d. averageweeklysales
	float AverageWeeklySales() {
		return TotalSalesForAllWeeks() / 5;
	}
	
	// e. weekwithhighestsaleamt
	int WeekWithHighestSaleAmt() {
		int maxWeek = 0;
		float maxSale = -1;
		
		for (int i = 0; i < 5; i++) {
			float sales = TotalSalesForWeek(i);
			if (sales > maxSale) {
				maxSale = sales;
				maxWeek = i + 1;
			}
		}
		return maxWeek;
	}
	// f. weekwithlowestsaleamt
	int WeekWithLowestSaleAmt() {
		int minWeek = 0;
		float minSale = Float.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			float sales = TotalSalesForWeek(i);
			if (sales < minSale) {
				minSale = sales;
				minWeek = i + 1;
			}
		}
		return minWeek;
	}
	
	// analyzeresults //call a through f //print
	public void AnalyzeResults() {
		Scanner in = new Scanner(System.in);
		
		String input2;
		int option;
		boolean flag = true;		
		
		// This loop helps program run again and again until user want to quit
		
		while (flag) {
			System.out.println("\n-----FRANCHISE MENU-----");
			System.out.println("1. The total sales for each week");
			System.out.println("2. The average daily sales for each week");
			System.out.println("3. The total sales for all the week");
			System.out.println("4. The average weekly sales");
			System.out.println("5. The week with the highest amount in sales");
			System.out.println("6. The week with the lowest amount in sales");
			System.out.println("7. All values above");
			System.out.println("8. Exit Franchise Menu");
			System.out.print("\nPlease enter an option (1 - 8) or q to quit: ");
			input2 = in.next();
			
			// User type q or Q to exit the program
			if (input2.equals("q")||input2.equals("Q")) {
				System.out.print("EXITED THE PROGRAM!\n");
				System.exit(0);
			}
			
			// Show an error message when user enter non-numeric option
			try {
				option = Integer.parseInt(input2);
			} catch (Exception e) {
				System.out.printf("ERROR! %s is invalid option!\n\n", input2);
				continue;
			}
			if (option < 0) {
				System.out.print("ERROR! Please enter positive option.\n");
				
			} else {
				// Show case by case equivalent to user's option
				if (option == 1) {
					System.out.printf("\nThe total sales for each week:\n");
					for (int i = 0; i < 5; i++) {									
						System.out.printf("  Week %d: %.2f \n", i + 1, TotalSalesForWeek(i));
					}
				}
				else if (option == 2) {					
					System.out.printf("\nThe average daily sales for each week:\n");							
					for (int i = 0; i < 5; i++) {
						System.out.printf("  Week %d: %.2f \n", i + 1, AvgSalesForWeek(i));
					}							
				}
				else if (option == 3) {					
					System.out.printf("\nThe total sales for all the week: %.2f", TotalSalesForAllWeeks());
					System.out.print("\n");
				}
				else if (option == 4) {					
					System.out.printf("\nThe average weekly sales: %.2f", AverageWeeklySales());
					System.out.print("\n");							
				}
				else if (option == 5) {					
					System.out.printf("\nThe week with the highest amount in sales: %d", WeekWithHighestSaleAmt());
					System.out.print("\n");
				}
				else if (option == 6) {					
					System.out.printf("\nThe week with the lowest amount in sales: %d", WeekWithLowestSaleAmt());
					System.out.print("\n");							
				}
				else if (option == 7) {
					System.out.printf("\nThe total sales for each week:\n");
					for (int i = 0; i < 5; i++) {
						System.out.printf("  Week %d: %.2f \n", i + 1, TotalSalesForWeek(i));
					}
					
					System.out.printf("\nThe average daily sales for each week:\n");
					for (int i = 0; i < 5; i++) {
						System.out.printf("  Week %d: %.2f \n", i + 1, AvgSalesForWeek(i));
					}
					System.out.printf("\nThe total sales for all the week: %.2f", TotalSalesForAllWeeks());
					System.out.printf("\nThe average weekly sales: %.2f", AverageWeeklySales());
					System.out.printf("\nThe week with the highest amount in sales: %d", WeekWithHighestSaleAmt());
					System.out.printf("\nThe week with the lowest amount in sales: %d\n", WeekWithLowestSaleAmt());
					System.out.print("\n");							
				}
				else if (option == 8) {
					System.out.println("Exited Frachise menu Store");
					flag = false;
				}
				else {
					System.out.print("ERROR! Please enter number from 1 to 8 to choose the option.\n");
				}
			}
		}
	}
}


	

