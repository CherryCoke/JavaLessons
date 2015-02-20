/*
Tyler Bonnette
17 Feb 2015
Array Practice/
Calculating Average
*/

package chapter3;

public class Average {
	public static void main(String args[]){
		
		double numbers[] = {10, 20, 30, 40};
		double result = 0;
		double average = 0;
		int i; //Used in for loop to iterate
		
		//i must be less than 4 because the array has 4 values
		for (i=0;  i<4; i++)
				//Add the result to the next number in the array
				result = result + numbers[i];	

		//Calculate and print out the average
		average = result / 4;
		System.out.println("The average is: " + average);
	}

}
