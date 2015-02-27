/*
 Tyler Bonnette
 26 Feb 2015
 If statement syntax
 */

package chapter5;

public class If {
	public static void main(String args[]){
		
		int a, b;
		
		/*If there is only one statement after the "if"
		then it is not neccessary to use brackets, for 
		example: */
		a = 1;
		b = 2;
		
		if (a < b)
			System.out.println("A is less than B");
		else
			System.out.println("B is less than A");
		System.out.println("");//Create a blank line
		
		/*Otherwise, is there are two statemnts, brackets
		are required like so: */
		a = 4;
		b = 1;
		if (a > b){
			System.out.println("A is equal to: " + a);
			System.out.println("B is equal to: " + b);
		}
		else
			System.out.println("A is less than B");
		
	}
}
