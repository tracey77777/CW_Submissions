/**
 * My name is Tracey Ly and this class was made on 9/23/24 as a main method to my six other shape classes that don't have main methods.
 */
public class Main
{
/**
 * This is a part of my Circle class and below returns, prints, and calculates, all the attributes to a circle.
 *
 */
	public static void main(String[] args)
	{
		//dot operator calls methods or attributes in (other) classes
		String shape = Circle.getShape();
		String sayShape = Circle.tellHowCircleWorks();
		System.out.println(shape);
		System.out.println(sayShape);
		
		Circle circOne = new Circle (4.0);
		Circle circTwo = new Circle (8.0);
		Circle circThree = new Circle (-2.0);
	
		System.out.print("Circles 1-3's radii are ");
		System.out.print(circOne.getRadius());
		System.out.print(", ");
		System.out.print(circTwo.getRadius());
		System.out.print(", ");
		System.out.println(circThree.getRadius());
	
		System.out.print("Circles 1-3's diameters are ");
		System.out.print(circOne.getDiameter());
		System.out.print(", ");
		System.out.print(circTwo.getDiameter());
		System.out.print(", ");
		System.out.println(circThree.getDiameter());
		
		System.out.print("Circles 1-3's areas are ");
		System.out.print(circOne.getArea());
		System.out.print(", ");
		System.out.print(circTwo.getArea());
		System.out.print(", ");
		System.out.println(circThree.getArea());
		
		System.out.print("Circles 1-3's circumferences are ");
		System.out.print(circOne.getCircum());
		System.out.print(", ");
		System.out.print(circTwo.getCircum());
		System.out.print(", ");
		System.out.println(circThree.getCircum());
		
  }

}
