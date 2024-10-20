/*
Student name: Y Nhi Tran
Class and Section: CIS 36A - 13Z
Assignment 3
Due Date: Mon Feb 20, 2023 11:59pm
Date Submitted: 02/20/2023
*/

package Assignment3;

public class Franchise {
	
	//Declare array of type Store
	private Store stores[];
	
	//Parameterized constructor
	public Franchise(int num) {
			stores = new Store[num];
	}
	
	//Function getStores() return object of type Store
	public Store getStores(int i) {
		return stores[i];
	}
	
	//Function setStores() initializes stores array
	public void setStores(Store stores, int i) {
		this.stores[i] = stores;
	}
	
	//Function NumberOfStores() returns the length of the stores array
	public int NumberOfStores()
	{
		return stores.length;
	}
	
}
