/*
Tyler Bonnette
14 Feb 2015
Data Type Examples
*/

/* 
 * In some other languages, like Python, a integer can be 
 * as big or small as it likes. Java developers thought
 * that integer types should be more specific, so bigger
 * numbers require a different classification/assignment.
 * 
 * In this case, a number big enough to calculate an equation
 * using the speed of light requires a long-type variable
 * because the answer is larger than approx. 2.2 billion
 */

package chapter3;

public class Long {
	public static void main(String args[]){
		
		/*
		 * Lightspeed and days both have values less than 2.2 bill,
		 * so they can be assigned as integer-type rather than long
		 */
		int lightspeed; 
		int days;
		
		//Changing seconds or distance to "int" will change the final answer
		//because the actual answer is too large for an int-type variable to hold
		long seconds;
		long distance;
		
		//Approx speed of light
		lightspeed  = 186000;
		days = 1000;
		seconds = days * 24 * 60 * 60; //converts days to seconds
		
		distance = lightspeed * seconds; //compute approx. distance
		
		System.out.println("In " + days + " days light will travel about ");
		System.out.println(distance + " miles.");
		
		
				
	}
}
