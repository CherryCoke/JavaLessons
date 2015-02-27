/*
 Tyler Bonnette
 26 Feb 2015
 Switch statement syntax
 */

package chapter5;

public class Switch {
	public static void main(String args[]){
		
		String age;
		int i;
		
		
		
		/*Switch statements check the status of one
		variable, and the output varies depending on 
		if its value matches a 'case' the user has
		defined, for example: */
		age = "Tyler";
		
		switch(age){
			case "Tyler": 
				System.out.println("Welcome, Tyler.");
				break;
			case "King": 
				System.out.println("You're not welcome, King.");
				break;
			default:
				System.out.println("I don't know who you are.");
		}
		System.out.println("");
		
		/*Breaks are optional, if there is no "break" the switch
		statement will automatically move onto the next statment below
		until a condition is finally met */
		
		for(i = 0; i < 12; i++)
			switch(i) {
				case 0: //i always starts at its current value, in this case 0
				case 1: //and then cycles down
				case 2: //and down
				case 3:
				case 4: //until it comes to a condition it can complete
					System.out.println("i is less than 5");
					break;
				case 5: //same for if i is greater than 5, it starts at 5
				case 6: //or 6, or 7, or, 8
				case 7:
				case 8:
				case 9: //and keeps going down until it hits 9 where it prints
					System.out.println("i is less than 10");
					break;
				default: //anything else isn't defined and prints the default
					System.out.println("i is 10 or more");
					
			}
	}

}
