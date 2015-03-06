/*
Tyler Bonnette
3 Mar 2015
Continue Statement syntax
*/

package chapter5;

public class Return {
	public static void main(String args[]){
		boolean t = true;
		
		//This is before the return statement/is unaffected
		System.out.println("Before the return");
		
		//If return statement is true
		if(t) return; //End method
		
		//Since it IS true this won't execute
		System.out.println("This won't execute");
	}

}
