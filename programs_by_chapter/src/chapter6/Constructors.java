/*
Tyler Bonnette
15 Mar 2015
While loop syntax
*/

package chapter6;

class Box2{ 
	double width;
	double height;
	double depth;
	
	//This is the constructor for the box
	Box2(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	void volume(){ 
		System.out.print("Volume is: ");
		System.out.println(width * height * depth);
	}
}


public class Constructors {
	
	public static void main(String args[]){
		//Setting w,h, and d as per the constructor
		Box2 myBox = new Box2(20, 10, 5);
		
		//Returning volume
		myBox.volume();
	}
}
