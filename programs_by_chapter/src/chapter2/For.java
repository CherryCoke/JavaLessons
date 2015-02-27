/* 
 Tyler Bonnette
 Feb 12 2015
 Basic For loop syntax
 */

package chapter2;

public class For {
	public static void main(String args[]){
		int x, y;
		
		
		/*
		 * For statement syntax
		 * 
		 * Variable, in this case 'x', that will fulfill the condition
		 * 		This variable is also called the loop control
		 * The condition itself that must be met, in this case x must 
		 * 		be less than 10
		 * And lastly what to iterate at the end of very loop, in this 
		 * 		case 1 is added to x for every iteration of the loop
		 */
		for (x = 0; x < 10; x = x + 1)
			//What happens if all conditions above are met
			System.out.println("X now equals: " + x);		
		
		
		System.out.println(""); //Blank line to make output more readable
		
		//The above for statement can be written in shorthand by 
		//using "y++" for "y = y + 1"
		for (y = 0; y < 5; y++)
			System.out.println("Y now equals: " + y);
		
	}

}
