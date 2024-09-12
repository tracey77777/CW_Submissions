/* My name is Tracey Ly and I created this class on 9/11/24 to practice methods. These were my tasks: Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
 *Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 
 *Create a method printMathStuffs() that is passed two ints and prints their sum, difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number. Call it to make sure it works. 
 */
public class Methods_Intro_Practice {

	public static void main(String[] args) {
		//By only calling for my name, hair style, and favorite food, the code will only print those sections even though I wrote out the code for all the topics.
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		//By calling and declaring my value here, my code to find the stats of a circle is completed.
		printCircleStats(2.0);
		//By calling and declaring my values of a and b here, my code below for "Math Stuffs" is completed. I assumed adding a comma between the two values will assign the first value to a and the second to b because that's what made sense to me. When I tried it, it worked as you can see.
		printMathStuffs(4,2);
		
		}
	// Create a void method called stateName() that prints out your name. Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood().
	//I'm not sure if I had to make separate void methods for each one but I did and it worked, so yay!
		public static void stateName() 
		{
		//All the SOP below are just my answer to each of the topics/void methods regarding it, in sentences.
		System.out.println("My name is Tracey Ly.");
		
		}
		public static void stateEyeColor()
		{
		System.out.println("My eye color is dark brown.");	
			
		}
		public static void stateHairStyle()
		{
		System.out.println("My hair style is an updo using a flower clip.");	
			
		}
		public static void stateBestFriend()
		{
		System.out.println("My best friend is Elizabeth Bao Thy Nguyen.");	
		
		}
		public static void stateFavoriteFood()
		{
		System.out.println("I don't have a favorite food as I'm indecisive.");
		
		
		
		
		}
		//Create a method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then prints out the radius, diameter, circumference, and area of the circle. Call the method to make sure it works. 
		//I put "double radius" in the parentheses because that's how Mr. Trauger wanted it and I declared its value in the main method instead of with the other doubles below.
		public static void printCircleStats(double radius)
		{
		//I put final because pi's value will never change.
		final double pi = 3.14;
		//Below are just formulas to find what's needed in the code.
		double dia = 2*radius;
		double circ = 2*pi*radius;
		double area = pi*(radius*radius);
		//Below is just writing the answer out in sentences.
		System.out.print("The circle's radius is ");	
		System.out.print(radius);
		System.out.println(". ");
		System.out.print("The circle's diameter is ");	
		System.out.print(dia);
		System.out.println(". ");
		System.out.print("The circle's circumference is ");	
		System.out.print(circ);
		System.out.println(". ");
		System.out.print("The circle's area is ");	
		System.out.print(area);
		System.out.println(". ");
		
		
		
		
		
		}
		//Create a method printMathStuffs() that is passed two ints and prints their sum, difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number. Call it to make sure it works. 
		//I put "int a, int b" in the parentheses because that's how Mr. Trauger wanted it and I declared their values in the main method instead of with the other ints below.
		public static void printMathStuffs(int a, int b)
		{
		//Below are formulas to find the sum, difference, product, quotient, and remainder of a and b.
		int sum = a+b;
		int dif = a-b;
		int pro = a*b;
		int quo = a/b;
		int rem = a%b;
		//Below is just writing the answer out in sentences.
		System.out.print("The sum of a plus b is ");	
		System.out.print(sum);
		System.out.println(". ");
		System.out.print("The difference of a minus b is ");	
		System.out.print(dif);
		System.out.println(". ");
		System.out.print("The product of a times b is ");	
		System.out.print(pro);
		System.out.println(". ");
		System.out.print("The quotient of a divided by b is ");	
		System.out.print(quo);
		System.out.println(". ");
		System.out.print("The remainder of a modulus b is ");	
		System.out.print(rem);
		System.out.println(". ");
		
		
		}
	

}
