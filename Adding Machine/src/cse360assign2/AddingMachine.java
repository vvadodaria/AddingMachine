/*  Name: Vipul Vadodaria
	Class ID: 41792
	Assignment 2
	Description: Contains a private variable for holding the total amount in the account
				 Also contains six methods to change the total amount and 
				 keep track of the transactions involving the account

*/

package cse360assign2;

/*	This class contains a private variable and six methods
 
 	<int total>
	This variable holds the total amount in the account after processing transactions
	
	<AddingMachine()>
	This method is the constructor, setting the total to 0
	
	<getTotal()>
	This method obtains and returns the total amount
	
	<add(int)>
	This method adds an amount to the total
	
	<subtract(int)>
	This method subtracts an amount from the total
	
	<toString()>
	This method returns the transaction history which is defaulted as an empty string
	
	<clear()>
	This method clears the transaction history 
 
 */

public class AddingMachine {

	private int total;
	
	// Constructor for setting the total to a default value
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	// obtains the total and returns it
	// @return 0: starting total amount is 0
	public int getTotal () {
		return 0;
	}
	
	// adds the parameter value to the total
	// @param value: amount to be added to the total
	public void add (int value) {
		
	}
	
	// subtracts the parameter value to the total
	// @param value: amount to be subtracted from the total
	public void subtract (int value) {
		
	}
		
	// obtains and returns the transaction history
	// @return "": transaction history is defaulted to an empty string
	public String toString () {
		return "";
	}
	
	// clears the current transaction history
	public void clear() {
	
	}
}
