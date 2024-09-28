/*
 * My name is Tracey Ly and this class was made on 9/23/24 as a main method to my six other shape classes that don't have main methods.
 */
public class Main
{

 //This is a part of my Circle class and below prints and calculates all the attributes to a circle.
 
	public static void main(String[] args)
	{
		//dot operator calls methods or attributes in (other) classes
		// this prints what the shape is
		String shape = Circle.getShape();
		String sayShape = Circle.tellHowCircleWorks();
		System.out.println(shape);
		System.out.println(sayShape);
		
		//values 4.0, 8.0, and -2.0 are my radiuses for my three circles
		
		Circle circOne = new Circle (4.0);
		Circle circTwo = new Circle (8.0);
		Circle circThree = new Circle (-2.0);
	
		//This is a part of my Circle class that has no main method and below prints and calculates all the attributes to a circle.
		 
		System.out.print("Circles 1-3's radiuses are ");
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
		
		System.out.print(circOne.toString());
		
		
		
		/**
		 * This is a part of my Square class and below prints and calculates all the attributes to a square.
		 *
		 */
		// this prints what the shape is
		
		String shapeTwo = Square.getShape();
		System.out.println(shapeTwo);
		
		Square squareOne = new Square (4.0);
		Square squareTwo = new Square (8.0);
		Square squareThree = new Square (-2.0);
		
		//This is a part of my Square class that has no main method and below prints and calculates all the attributes to a square.
		 
		
		System.out.print("Square 1-3's sides are ");
		System.out.print(squareOne.getSide());
		System.out.print(", ");
		System.out.print(squareTwo.getSide());
		System.out.print(", ");
		System.out.println(squareThree.getSide());
	
		System.out.print("Square 1-3's areas are ");
		System.out.print(squareOne.getArea());
		System.out.print(", ");
		System.out.print(squareTwo.getArea());
		System.out.print(", ");
		System.out.println(squareThree.getArea());
	
		System.out.print("Square 1-3's perimeters are ");
		System.out.print(squareOne.getPeri());
		System.out.print(", ");
		System.out.print(squareTwo.getPeri());
		System.out.print(", ");
		System.out.println(squareThree.getPeri());
		
		
		
		
		/**
		 * This is a part of my Rectangle class and below prints and calculates all the attributes to a rectangle.
		 *
		 */
		
		
		// this prints what the shape is
		
		String shapeThree = Rectangle.getShape();
		System.out.println(shapeThree);
		
		Rectangle rectangleOne = new Rectangle (4.0, 2.0);
		Rectangle rectangleTwo = new Rectangle (8.0, 4.0);
		Rectangle rectangleThree = new Rectangle (-2.0, -1.0);
		
		//This is a part of my Rectangle class that has no main method and below prints and calculates all the attributes to a rectangle.
		 
		
		System.out.print("Rectangle 1-3's lengths are ");
		System.out.print(rectangleOne.getLength());
		System.out.print(", ");
		System.out.print(rectangleTwo.getLength());
		System.out.print(", ");
		System.out.println(rectangleThree.getLength());
	
		System.out.print("Rectangle 1-3's widths are ");
		System.out.print(rectangleOne.getWidth());
		System.out.print(", ");
		System.out.print(rectangleTwo.getWidth());
		System.out.print(", ");
		System.out.println(rectangleThree.getWidth());
		
		System.out.print("Rectangle 1-3's areas are ");
		System.out.print(rectangleOne.getArea());
		System.out.print(", ");
		System.out.print(rectangleTwo.getArea());
		System.out.print(", ");
		System.out.println(rectangleThree.getArea());
	
		System.out.print("Rectangle 1-3's perimeters are ");
		System.out.print(rectangleOne.getPeri());
		System.out.print(", ");
		System.out.print(rectangleTwo.getPeri());
		System.out.print(", ");
		System.out.println(rectangleThree.getPeri());
		
		
		
		/*
		 * This is a part of my Parallelogram class and below prints and calculates all the attributes to a parallelogram.
		 *
		 */
		
		// this prints what the shape is
		
		String shapeFour = Parallelogram.getShape();
		System.out.println(shapeFour);
		
		Parallelogram parallelogramOne = new Parallelogram (4.0, 2.0, 4.0);
		Parallelogram parallelogramTwo = new Parallelogram (8.0, 4.0, 8.0);
		Parallelogram parallelogramThree = new Parallelogram (-2.0, -1.0, -2.0);
		
		//This is a part of my Parallelogram class that has no main method and below prints and calculates all the attributes to a parallelogram.
		 
		
		System.out.print("Parallelogram 1-3's bases are ");
		System.out.print(parallelogramOne.getBase());
		System.out.print(", ");
		System.out.print(parallelogramTwo.getBase());
		System.out.print(", ");
		System.out.println(parallelogramThree.getBase());
	
		System.out.print("Parallelogram 1-3's heights are ");
		System.out.print(parallelogramOne.getHeight());
		System.out.print(", ");
		System.out.print(parallelogramTwo.getHeight());
		System.out.print(", ");
		System.out.println(parallelogramThree.getHeight());
		
		System.out.print("Parallelogram 1-3's sides are ");
		System.out.print(parallelogramOne.getSide());
		System.out.print(", ");
		System.out.print(parallelogramTwo.getSide());
		System.out.print(", ");
		System.out.println(parallelogramThree.getSide());
		
		System.out.print("Parallelogram 1-3's areas are ");
		System.out.print(parallelogramOne.getArea());
		System.out.print(", ");
		System.out.print(parallelogramTwo.getArea());
		System.out.print(", ");
		System.out.println(parallelogramThree.getArea());
	
		System.out.print("Parallelogram 1-3's perimeters are ");
		System.out.print(parallelogramOne.getPeri());
		System.out.print(", ");
		System.out.print(parallelogramTwo.getPeri());
		System.out.print(", ");
		System.out.println(parallelogramThree.getPeri());
		
		
		
		

		/*
		 * This is a part of my Trapezoid class and below prints and calculates all the attributes to a trapezoid.
		 *
		 */
		
		// this prints what the shape is
		
		
		String shapeFive = Trapezoid.getShape();
		System.out.println(shapeFive);
		
		Trapezoid trapezoidOne = new Trapezoid (4.0, 2.0, 3.0, 4.0);
		Trapezoid trapezoidTwo = new Trapezoid (8.0, 4.0, 5.0, 8.0);
		Trapezoid trapezoidThree = new Trapezoid (-2.0, -1.0, 1.0, -2.0);
		
		//This is a part of my Trapezoid class that has no main method and below prints and calculates all the attributes to a trapezoid.
		 
		
		System.out.print("Trapezoid 1-3's first bases are ");
		System.out.print(trapezoidOne.getBase());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getBase());
		System.out.print(", ");
		System.out.println(trapezoidThree.getBase());
		
		System.out.print("Trapezoid 1-3's second bases are ");
		System.out.print(trapezoidOne.getBbase());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getBbase());
		System.out.print(", ");
		System.out.println(trapezoidThree.getBbase());
	
		System.out.print("Trapezoid 1-3's heights are ");
		System.out.print(trapezoidOne.getHeight());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getHeight());
		System.out.print(", ");
		System.out.println(trapezoidThree.getHeight());
		
		System.out.print("Trapezoid 1-3's sides are ");
		System.out.print(trapezoidOne.getSide());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getSide());
		System.out.print(", ");
		System.out.println(trapezoidThree.getSide());
		
		System.out.print("Trapezoid 1-3's areas are ");
		System.out.print(trapezoidOne.getArea());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getArea());
		System.out.print(", ");
		System.out.println(trapezoidThree.getArea());
	
		System.out.print("Trapezoid 1-3's perimeters are ");
		System.out.print(trapezoidOne.getPeri());
		System.out.print(", ");
		System.out.print(trapezoidTwo.getPeri());
		System.out.print(", ");
		System.out.println(trapezoidThree.getPeri());
		
		
		
		

		/*
		 * This is a part of my Triangle class and below prints and calculates all the attributes to a triangle.
		 *
		 */
		
		
		// this prints what the shape is
		
		String shapeSix = Triangle.getShape();
		System.out.println(shapeSix);
		
		Triangle triangleOne = new Triangle (4.0, 3.0, 4.0);
		Triangle triangleTwo = new Triangle (8.0, 5.0, 8.0);
		Triangle triangleThree = new Triangle (-2.0, 1.0, -2.0);
		
		//This is a part of my Triangle class that has no main method and below prints and calculates all the attributes to a triangle.
		 
		
		System.out.print("Triangle 1-3's first bases are ");
		System.out.print(triangleOne.getBase());
		System.out.print(", ");
		System.out.print(triangleTwo.getBase());
		System.out.print(", ");
		System.out.println(triangleThree.getBase());
	
		System.out.print("Triangle 1-3's heights are ");
		System.out.print(triangleOne.getHeight());
		System.out.print(", ");
		System.out.print(triangleTwo.getHeight());
		System.out.print(", ");
		System.out.println(triangleThree.getHeight());
		
		System.out.print("Triangle 1-3's sides are ");
		System.out.print(triangleOne.getSide());
		System.out.print(", ");
		System.out.print(triangleTwo.getSide());
		System.out.print(", ");
		System.out.println(triangleThree.getSide());
		
		System.out.print("Triangle 1-3's areas are ");
		System.out.print(triangleOne.getArea());
		System.out.print(", ");
		System.out.print(triangleTwo.getArea());
		System.out.print(", ");
		System.out.println(triangleThree.getArea());
	
		System.out.print("Triangle 1-3's perimeters are ");
		System.out.print(triangleOne.getPeri());
		System.out.print(", ");
		System.out.print(triangleTwo.getPeri());
		System.out.print(", ");
		System.out.println(triangleThree.getPeri());
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}


