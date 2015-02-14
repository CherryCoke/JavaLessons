/* 
 Tyler Bonnette
 Feb 12 2015
 Basic Java Program
 */

package chapter2;

class Hello { //defining the class "Hello" -- since the file is a .class file 
			  //this class' name must match the file name
	/*
	 * Every Java code will have a main() function that will be initiated first
	 * 
	 * Java is case-sensitive so main() is different from Main()
	 * 
	 * Three keywords, or modifiers, precede the method main() below
	 * The first, "public", means the code can be accessed from outside the class in which it
	 * 		was declared--the opposite of public is "private"
	 * "static" means it can be called without have to create an instance of that method which is 
	 * 		necessary for main since it is called first and therefore it couldn't be instantiated before.
	 * "void" simply means that main does not return a value
	 * 
	 * Like most other languages, the brackets after main() are where you would declare any
	 * arguments or modifiers to the function
	 */
	public static void main(String args[]) { //Java uses identifiers/brackets to hold code
											 //together, so white space doesn't matter
		System.out.println("This is a simple java program."); //semi-colon denotes the end of a line
		//System is a pre-defined Java class and println is a pre-defined method within System
		
		System.out.println("This is another line."); //Println starts and ends on its own individual line
		
		System.out.print("Tyler"); //Whereas "regular" print statements will not create their own line
		System.out.print(" Bonnette");
	}
} 
