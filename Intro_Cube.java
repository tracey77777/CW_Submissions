 
public class Intro_Cube {

	public static void main(String[] args) {
		/* My name is Tracey and this class uses code to calculate the area and volume of a cube. (August 30, 2024)*/
		
		// declare a side length as a double
		// calculate its surface area
		// calculate its volume
		// print its values as int
		// well documented
		
		// this declares a side length as an double
		double side = 2;
		//this calculates the area of the already declared side and declares it as "area"
		double area = 6*(side*side);
		// this calculates the volume of the already declared side and declares it as "vol"
		double vol = (side*side*side);
		// the following code writes out the answer in sentences
		System.out.print("One side of this cube is ");
		System.out.println(side);
		System.out.print("Its surface area is ");
		System.out.println((int)area);
		System.out.print("Lastly, its volume is ");
		System.out.print((int)vol);
	}

}
