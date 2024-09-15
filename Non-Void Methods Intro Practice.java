/* My name is Tracey Ly and I created this class on 9/13/24 to practice non-void methods. These were my tasks: Create a nonvoid method called stateName() that returns your name. Repeat this task for stateEyeColor(), stateHairStyle(), stateBestFriend(), and stateFavoriteFood(). Then, call stateName(), stateHairStyle, and stateFavoriteFood(). Use the calls to make a full print statement. 
Create a nonvoid method printCircleStats() that is passed a double (meant to represent a circle's radius) and calculates then returns the radius, diameter, circumference, and area of the circle. Call the method in a print statement or variable declaration in order to make a complete print statement of all the properties. 
Create nonvoid methods that are passed two ints and returns their sum, difference, product, quotient, and the remainder (using modulus) of the first number modulus the second number; all operations should be their own respective methods. Call them inside print statements to make sure they work. */
public class Non_Void_Method_Practice {
	//the return statement exits your method (anything after the line of "return" is dead code (won't work))

	public static void main(String[] args) {
		
		//By only calling for my name, hair style, and favorite food, the code will only print those sections even though I wrote out the code for all the topics.
		System.out.println(stateName());
		System.out.println(stateHairStyle());
		System.out.println(stateFavoriteFood());
		
		//I had to use the variable "two" instead of "2" or just writing the number two in the formula without declaring because it wouldn't work otherwise.
		int two = 2;
		//I put final because pi's value will never change.
		final double pi = 3.14;
		double rad = 2.0;
		//This code below declare, passes, and prints my code out.
		double dia = calcDiameter(rad);
		System.out.println("The diameter is " + dia);
		double circ = calcCircumference(two,pi,rad);
		System.out.println("The circumference is " + circ);
		double area = calcArea(pi,rad);
		System.out.println("The area is " + area);
		
		int a = 4;
		int b = 2;
		//This code below declare, passes, and prints my code out.
		double sum = calcSum(a,b);
		System.out.println("The sum of a and b is " + sum);
		double dif = calcDif(a,b);
		System.out.println("The difference of a and b is " + dif);
		double pro = calcPro(a,b);
		System.out.println("The product of a and b is " + pro);
		double quo = calcQuo(a,b);
		System.out.println("The quotient of a and b is " + quo);
		double rem = calcRem(a,b);
		System.out.println("The remainder of a and b is " + rem);
		
	}
	
	
	
	
	
	
	//TASK 1
		public static String stateName()
		{
			return "My name is Tracey Ly.";
		}
		
		public static String stateHairStyle()
		{
			return "My hair style is in a messy low bun.";
		}
		
		public static String stateEyeColor()
		{
			return "My eye color is dark brown.";
		}
		
		public static String stateBestFriend()
		{
			return "My best friend is Elizabeth Bao Thy Nguyen, I guess.";
		}
		
		public static String stateFavoriteFood()
		{
			return "I can't choose just one thing to be my favorite food.";
		}
		
		//TASK 2
		
		public static double calcDiameter(double rad)
	
		
		{
			return (rad+rad);
		}
		//Notice how I have int two in there because it's a different formula :D
		public static double calcCircumference(int two, double pi, double rad)
	
		{
			return (two*pi*rad);
		}
		
		public static double calcArea(double pi, double rad)
		
		{
			return (pi*(rad*rad));
		}
		
		//TASK 3
		
		public static double calcSum (int a, int b)
		{
			return (a+b);
		}
		
		public static double calcDif (int a, int b)
		{
			return (a-b);
		}
		
		public static double calcPro (int a, int b)
		{
			return (a*b);
		}
		
		public static double calcQuo (int a, int b)
		{
			return (a/b);
		}
		
		public static double calcRem (int a, int b)
		{
			return (a%b);
		}
		
		//All done!
		
		
		
}
