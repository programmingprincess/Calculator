/** Calculator allows user to add, subtract, divide, multiply, 
 *  see the total and get the calculation history. 
 *  
 * @author Jiaqi Wu
 * PIN: 908
 * @version February 21, 2016
 */

package cse360assign3;

public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * Constructor for Calculator
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Method that returns user's total value
	 * @return total value
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to total
	 * @param value to be added
	 */
	public void add (int value) {
		total += value;
		
		getHistory(" + " + value);
	}
	
	/**
	 * Subtracts value from total
	 * @param value to be subtracted 
	 */
	public void subtract (int value) {
		total -= value;
		
		getHistory(" - " + value);
	}
	
	/**
	 * Multiplies the current total by value
	 * @param multiplying factor
	 */
	public void multiply (int value) {
		total = total * value;
		
		getHistory(" * " + value);
	}
	
	/**
	 * Divides current total by value
	 * @param value to divide by 
	 */
	public void divide (int value) {
		if (value == 0) 
			total = 0;
		else
			total = total/value;
		
		getHistory(" / " + value);
	}
	
	/**
	 * Get calculation history
	 * @return string with past calculations
	 */
	public String getHistory (String newInfo) {
		history += newInfo;
		return history;
	}
}
