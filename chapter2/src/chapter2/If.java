/* 
 Tyler Bonnette
 Feb 12 2015
 Basic If Syntax
 */


/*
 * Operators are standard
 * 	< 	less than
 * 	> 	greater than
 * 	== 	equal to
 *  +,- Addition/Subtraction
 *  *,/ Multiplication/Division
 */
package chapter2;

public class If {
	public static void main(String args[]) {
		
		int x, y; //Declaring integer-type variables
		
		//Assigning values to those variables
		x = 10;
		y = 20;
		
		//Basic if statement that checks to see if x is less than y
		if (x < y) System.out.println("x is less than y.");
		
		//Everything else is simple enough:
		x = x * 2;
		if (x == y) System.out.println("x and y are now equal.");
		
		y = y - 1;
		if (x > y) System.out.println("y is now less than x.");
		
		x = x / 2;
		if (x == 10) System.out.println("x is back to its original value");
		
	}
}
	