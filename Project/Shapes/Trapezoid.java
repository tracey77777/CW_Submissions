/* 
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a trapezoid, without a main method and with and without static. 
 *  This includes attributes of trapezoids like its two bases, height, sides, area, and perimeter.
 */


public class Trapezoid
{

	//data attributes 
	private double base;
	private double height;
	private double bbase;
	private double side;
	
	//constructor
	public Trapezoid (double b, double h, double c, double s)
	{
		base = b;
		height = h;
		bbase = c;
		side = s;
	}


	//functionality
	/**
	 * this method returns the base
	 * @return the base
	 */
	public double getBase()
	{
		return base;
	}
	/**
	 * this method returns the second base
	 * @return the second base
	 */
	public double getBbase()
	{
		return bbase;
	}
	/**
	 * this method returns the height
	 * @return the height
	 */
	public double getHeight()
	{
		return height;
	}
	/**
	 * this method returns the side
	 * @return the side
	 */
	public double getSide()
	{
		return side;
	}
	/**
	 * this method returns the perimeter
	 * @return the perimeter
	 */
	public double getArea()
	{
		return (0.5*(base+bbase)*height);
	}
	/**
	 * this method returns the perimeter
	 * @return the perimeter
	 */
	public double getPeri()
	{
		return (base+bbase+side+side);
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
		return "Trapezoid";
	}
	
	
}
