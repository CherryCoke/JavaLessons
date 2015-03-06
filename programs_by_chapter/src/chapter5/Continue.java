/*
Tyler Bonnette
3 Mar 2015
Continue Statement syntax
*/

package chapter5;

public class Continue {
	public static void main(String args[]){
	
		//Creating variable
		int x;
		
		for (x=0; x<10; x++){
			//Print the current number on the current line
			System.out.print(x + " "); 
			
			//Unless the number is evenly divisible by two
			if (x%2 == 0) continue; 
			//Then print that number starting on a new line
			System.out.println("");
			
			
		}
	
	}

}
