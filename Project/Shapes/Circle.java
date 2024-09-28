/* 
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a circle, without a main method and with and without static. 
 *  This includes attributes of circles like its radius, diameter, area, and circumference.
 */
public class Circle
{
	//data attributes 
	//these are my attributes of a circle
	private final double pi = 3.14;
	private double radius;
	
	//constructor
	//these make my attributes into actual variables
	public Circle (double r)
	{
		radius = r;
	}

	
	//functionality
	/**
	 * this method returns the radius
	 * @return the radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * this method returns the diameter
	 * @return the diameter
	 */
	
	public double getDiameter()
	{
		return (radius+radius);
	}
	
	/**
	 * this method returns the area
	 * @return the area
	 */
	
	public double getArea()
	{
		return (pi*(radius*radius));
	}
	
	/**
	 * this method returns the circumference
	 * @return the circumference
	 */
	
	public double getCircum()
	{
		return (2*pi*radius);
	}
	
	/**
	 * this method sets the radius of circOne
	 * @param r
	 */
	
	public void setRadius(double r)
	{
		radius = r;
	}
	
	/**
	 * This turns everything about the circle object into a string.
	 * @return circle definition
	 */
	
	public String toString()
	{
		return "This is a circle with radius" + radius +
		"and an area of" + getArea() + "and circumference of" + getCircum() + ".";
	}
	
	//what is "getDimensions"???
	
	
	//static means it doesn't depend on a specific object

	//"private/public" is the accessibility modifier (private = other classes can't call that method or attributes, public = can)
	//same class can see even if it's private
	
	
	// classes have three things, data attributes, constructor, and functionality (methods)
	//below returns what will get printed when I call "getShape" and how a circle works
	
	/**
	 * this method says what the shape is
	 * @return this is a circle
	 */
	
	public static String getShape()
	{
		return "This shape is a circle.";
	}
	
	/**
	 * this method says what a circle is
	 * @return what a circle is
	 */

	public static String tellHowCircleWorks()
	{
		return "Hello Tracey, a circle is made by ensuring all created points are a radius length away from a set point.";
	}
	
}
