/* 
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a square, without a main method and with and without static. 
 *  This includes attributes of squares like its sides, area, and perimeter.
 */

public class Square
{

	// data attributes 
	private double side;
	
	//constructor
	public Square (double s)
	{
		side = s;
	}

	
	//functionality
	
	/**
	 * this method returns the side
	 * @return the side
	 */
	public double getSide()
	{
		return side;
	}
	
	/**
	 * this method returns the area
	 * @return the area
	 */
	public double getArea()
	{
		return (side*side);
	}
	
	/**
	 * this method returns the perimeter
	 * @return the perimeter
	 */
	public double getPeri()
	{
		return (4*side);
	}
	
	
	//static means it doesn't depend on a specific object

	//"private/public" is the accessibility modifier (private = other classes can't call that method or attributes, public = can)
	//same class can see even if it's private
	
	
	// classes have three things, data attributes, constructor, and functionality (methods)
	/**
	 * this method returns the name of the shape
	 * @return the name of shape
	 */
	public static String getShape()
	{
		return "Square";
	}
	
	
	
	
	
}
