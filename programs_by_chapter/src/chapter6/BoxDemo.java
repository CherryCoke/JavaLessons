/*
Tyler Bonnette
10 Mar 2015
While loop syntax
*/

package chapter6;

/*Goal of this program is to find the volume of a box

So to do that, we need to be able to create a "box,"
and we need to know what that box's width, height, and 
depth are

By creating a Box class we can ensure that any instances
or variables created that are "boxes" will have each 
of those values/attributes/variables
*/

class Box{
	//Attributes of the box
	double width;
	double height;
	double depth;
}

public class BoxDemo {
	public static void main(String args[]){
		
		/*Creating an instance, or object, of the Box class.
		In this case, its called myBox*/
		Box myBox = new Box();
		
		double vol; //Variable to hold the volume
		
		//Giving values to myBox
		myBox.width = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		//Now calculate the volume of myBox
		vol = myBox.width * myBox.height * myBox.depth;
		
		System.out.println("myBox's volume is: " + vol);
		
		/*And because Box is a class, it makes it simple
		to duplicate/repeat the above with a new "box"*/
		
		Box myBox2 = new Box();
		
		myBox2.width = 100;
		myBox2.height = 102;
		myBox2.depth = 2;
		
		vol = myBox2.width * myBox2.height * myBox2.depth;
		
		System.out.println("myBox2's volume is: " + vol);
		
		
	}

}
