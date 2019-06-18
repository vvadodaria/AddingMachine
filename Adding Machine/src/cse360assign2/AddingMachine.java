/*  Name: Vipul Vadodaria
	Class ID: 41792
	Assignment 2
	Description: Contains a private variable for holding the total amount in the account
				 Also contains six methods to change the total amount and 
				 keep track of the transactions involving the account

*/

package cse360assign2;

/*	This class contains a three private variables and six methods
 
 	<int total>
	This variable holds the total amount in the account after processing transactions
	
	<String transactionHistory>
	This variable holds the history of transactions of the account
	
	<String temp>
	This variable holds the value added or subtracted to the account as a string to add
	to the transaction history.
	
	<AddingMachine()>
	This method is the constructor, setting the total to 0
	
	<getTotal()>
	This method obtains and returns the total amount
	
	<add(int)>
	This method adds an amount to the total
	
	<subtract(int)>
	This method subtracts an amount from the total
	
	<toString()>
	This method returns the current transaction history
	
	<clear()>
	This method clears the transaction history 
 
 */

public class AddingMachine {

	private int total;
	private String transactionHistory = "0 ";
	private String temp;
	
	// Constructor for setting the total to a default value
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	// obtains the total and returns it
	// @return total: total amount in account is returned
	public int getTotal () 
	{
		return total;
	}
	
	// adds the parameter value to the total
	// @param value: amount to be added to the total
	public void add (int value) 
	{
		total = total + value;
		temp = String.valueOf(value);
		transactionHistory = transactionHistory + "+ " + temp + "";
		
	}
	
	// subtracts the parameter value to the total
	// @param value: amount to be subtracted from the total
	public void subtract (int value) 
	{
		total = total - value;
		temp = String.valueOf(value);
		transactionHistory = transactionHistory + "- " + temp + "";
	}
		
	// obtains and returns the transaction history
	// @return transactionHistory: current transaction history is returned
	public String toString () 
	{
		return transactionHistory;
	}
	
	// clears the current transaction history
	public void clear() 
	{
		transactionHistory = "0 ";
	}
}
