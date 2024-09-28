/*
 *  My name is Tracey Ly and this class was made on 9/23/24 to code objects, in this case, a parallelogram, without a main method and with and without static. 
 *  This includes attributes of parallelograms like its sides, bases, height, area, and perimeter.
 */

public class Parallelogram 
{

	//data attributes 
	
	// these are the attributes of the parallelograms
			private double base;
			private double height;
			private double side;
		
			
			//constructor
			
		// these make my attributes to variables
			public Parallelogram (double b, double h, double s)
			{
				base = b;
				height = h;
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
			 * this method returns the base
			 * @return the base
			 */
			
			public double getBase()
			{
				return base;
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
			 * this method returns the area
			 * @return the area
			 */
			
			public double getArea()
			{
				return (base*height);
			}
			
			/**
			 * this method returns the perimeter
			 * @return the perimeter
			 */
			
			public double getPeri()
			{
				return (2*(side+base));
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
				return "Parallelogram";
			}
			
	
	
	
	
	
	
}
