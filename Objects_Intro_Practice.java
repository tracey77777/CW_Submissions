/** 
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a circle, without a main method and with and without static.
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
	//below returns my radius, diameter, area, and circumference)
	public double getRadius()
	{
		return radius;
	}
	
	public double getDiameter()
	{
		return (radius+radius);
	}
	
	public double getArea()
	{
		return (pi*(radius*radius));
	}
	
	public double getCircum()
	{
		return (2*pi*radius);
	}
	
	public double setRadius()
	{
		return radius;
	}
	
	//what is "getDimensions"???
	
	
	//static means it doesn't depend on a specific object

	//"private/public" is the accessibility modifier (private = other classes can't call that method or attributes, public = can)
	//same class can see even if it's private
	
	
	// classes have three things, data attributes, constructor, and functionality (methods)
	//below returns what will get printed when I call "getShape" and how a circle works
	public static String getShape()
	{
		return "This shape is a circle.";
	}
	
	public static String tellHowCircleWorks()
	{
		return "Hello Tracey, a circle is made by ensuring all created points are a radius length away from a set point.";
	}
	
}
