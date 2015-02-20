/* 
 Tyler Bonnette
 Feb 20 2015
 Multidimensional Arrays
 */

package chapter3;

public class MultiArray {
	public static void main(String args[]){
		
		//Creating a 4x5 grid
		int multiArray[][] = new int[4][5];
		
		//Creating variables to keep track of current row/column
		//and another to iterate through the loop
		int row, column, k = 0;
		
		
		for (row = 0; row < 4; row++)
			for (column = 0; column < 5; column++) {
				//Add the current "place" in the array
				multiArray[row][column] = k;
				k++;
			}
		
		for (row = 0; row < 4; row++){
			for (column = 0; column < 5; column++)
				//Print out where each "place" in the array is
				System.out.print(multiArray[row][column] + " ");
			System.out.println("");
			
		}
	}
}
