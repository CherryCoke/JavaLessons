/*
Tyler Bonnette
1 Mar 2015
For loop syntax
*/

package chapter5;

public class For {
	public static void main(String args[]){
		
		//Creating arbitrary variables
		int x;
		int y;
		
		//For every time x is less than 10
		for (x=1; x<=10; x++){
			System.out.println(x); //Print x
		}
		
		System.out.println("");
		
		/*Technically you don't need to use brackets
		 *if the statement after the for is one
		 line or less...so this would work as well:*/
		for (y=1; y<=10; y++)
			System.out.println(y);
		
		/*This particular statement would technically be 
		  be more "correct" to use a while statement in this  
		  case, but for the sake of example...*/
	}
}
