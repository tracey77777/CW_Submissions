/* 
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a triangle, without a main method and with and without static. 
 *  This includes attributes of triangles like its base, height, sides, area, and perimeter.
 */

public class Triangle 
{

	//data attributes 
	private double base;
	private double height;
	private double side;
	
	//constructor
	public Triangle (double b, double h, double s)
	{
		base = b;
		height = h;
		side = s;
	}


	//functionality
	
	public void setBase(double base) {
		this.base = base;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setSide(double side) {
		this.side = side;
	}


	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getSide()
	{
		return side;
	}
	
	public double getArea()
	{
		return (0.5*(base*height));
	}
	
	public double getPeri()
	{
		return (base+side+side);
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
		return "Triangle";
	}
	
	
}

	

