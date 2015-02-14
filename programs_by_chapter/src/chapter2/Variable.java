/* 
 Tyler Bonnette
 Feb 12 2015
 Basic Java Variables
 */

package chapter2;

public class Variable {
	
	public static void main(String args[]) {
		
		int num; //First you have to declare the variable
		num = 100; //Before you can give it a value
		
		//You can concatenate strings/numbers/both with a "+" sign
		System.out.println("This is a number: " + num);
		
		//Redefining a variable will overwrite its initial value (like usual)
		num = num * 2;
		System.out.println("The last number times two equals: " + num);
				
	}
}
