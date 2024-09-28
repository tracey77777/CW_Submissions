/*
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a rectangle, without a main method and with and without static. 
 *  This includes attributes of rectangles like its length, width, area, and perimeter.
 */


public class Rectangle 
{
	//data attributes 
	
		private double length;
		private double width;
	
		
		//constructor
		// these make the attributes into variables
		public Rectangle (double l, double w)
		{
			length = l;
			width = w;
		}

	
		//functionality
		
		/**
		 * this method returns the length
		 * @return the length
		 */
		
		public double getLength()
		{
			return length;
		}
		
		/**
		 * this method returns the width
		 * @return the width
		 */
		
		public double getWidth()
		{
			return width;
		}
		
		/**
		 * this method returns the area
		 * @return the area
		 */
		
		public double getArea()
		{
			return (length*width);
		}
		
		/**
		 * this method returns the perimeter
		 * @return the perimeter
		 */
		
		public double getPeri()
		{
			return (2*(length+width));
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
			return "Rectangle";
		}
		

	
	
}
