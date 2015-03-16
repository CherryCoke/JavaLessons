/*
Tyler Bonnette
10 Mar 2015
While loop syntax
*/

package chapter6;

//Goal is stil to find the volume of a box

class Box1{ //Box already exists elsewhere in the package
	double width;
	double height;
	double depth;
	
	//Defining a method, vol, to find the volume of a box
	void volume(){ //Void because no value is being returned
		System.out.print("Volume is: ");
		
		/*Width, height, and depth are variables defined inside
		the class, so they don't have to have the box prefix*/
		System.out.println(width * height * depth);
	}
	
	/*If data type isn't void, in this case double, you must
	return a value of that data type*/
	double vol(){
		return width * height * depth; //Returning a double
	}
	
	//Method takes parameters to set width, height, and depth
	void setDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
		
	}
}

public class BoxMethods {
	public static void main(String args[]){
		Box1 myBox1 = new Box1();
		Box1 myBox2 = new Box1();
		Box1 myBox3 = new Box1();
		
		//Setting each box's object attributes/variables
		myBox1.width = 200;
		myBox1.height = 100;
		myBox1.depth = 50;
		
		myBox2.width = 50;
		myBox2.height = 75;
		myBox2.depth = 5;
		
		//Using created method to set width, height, and depth
		myBox3.setDim(66, 57, 2);
		
		/*Using the class method, vol, to calculate the 
		volume for each box instance*/
		myBox1.volume();
		myBox2.volume();
		myBox3.volume();
		
		System.out.println();
		
		//Also works when directly returning a value/double
		System.out.println("myBox1's volume is: " + myBox1.vol());
		System.out.println("myBox2's volume is: " + myBox2.vol());
		System.out.println("myBox3's volume is: " + myBox3.vol());
	}
}
