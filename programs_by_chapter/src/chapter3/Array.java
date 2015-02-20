/*
Tyler Bonnette
17 Feb 2015
Arrays
*/

package chapter3;

public class Array {
	public static void main(String args[]){
		
		/*
		 * Basic syntax for arrays is:
		 * 
		 * type array-name[];
		 * 
		 * In this case, month_days is the array name, and
		 * it is an array of integers
		 */
		
		//What this line says is:
		//Allocate data for 12 integers inside the array month_days
		int month_days[] = new int[12];
		
		/*
		 * The new operator is a special operator in java
		 * that allocates memory
		 */
		
		//Adding the number of days in each month to the array
		month_days[0] = 31; //January
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31; 
		month_days[5] = 30; //June
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31; //December
		
		//You can then reference any variable within the array
		System.out.println("April has " + month_days[3] + " days.");
	
		
		/*The short hand, alternative, method to the above code:
		There is no need for "new" with this method, java will
		automatically allocate the necessary memory.*/
		int days_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
								30, 31};
		
		System.out.println("April has " + days_month[3] + " days.");
		
	}
}
