/*
 * This class is my strings practice for the MYC project. Made 12/12/24 by Tracey Ly
 */
import java.util.Scanner;
public class Strings_Practice 
{
	
	//this opens a scanner
		static Scanner myReader = new Scanner (System.in);
		
		public static void main(String[] args) 
		{
			//calls the first method
			taskOne();
			//calls the second method
			taskTwo();
			
		}
	
	// 1. Create a while loop that prompts the user to input text into the console, and 
	//then the console prints out what they inputed and a number representing how many
	//times the loop has run. Unless the player types "stop" in which case the loop 
	//should end. (For those of you that know the break keyword, you are forbidden 
	//from using it).
		public static void taskOne()
		{
			System.out.println("Please write a word below:");
			//opens scanner
			String input = myReader.nextLine();
			boolean test = true;
		//will print whatever a person types in the console again and again until they type "stop"
			while (test)
			{
				//if the typer puts in "stop", the loop will stop running
				if (input.equals("stop"))
				{
					test = false;
				}
				//if the typer types anything but "stop", this will rerun the loop
				else 
				{
					test  = true;
					System.out.println("Keep typing!");
					//opens scanner
					input = myReader.nextLine();
				}
			}
		}
		
		 

// Use your previously created shapes classes to complete the following task: Choose 
//one of the shape objects you created, for example Circle1. Make a for loop that
//will run 5 times. Each time, the user should be prompted to input a double. Then, 
//the double should be added to one of the object's attributes. After the loop is 
//done, print the shape's original attribute value and its final attribute value. 
// ( instead of .next() or .nextLine(), use nextDouble() )
// Example (with assumption that a Circle object has been instantiated with a radius of 
	//4.0):
// Input a number: 2.1
// Input a number: 3.2
// Input a number: 5.1
// Input a number: 8.3
// Input a number: 3.0
// Your shape started with a radius of 4.0 and ended with a radius of 25.7.
		

		
		public static void taskTwo()
		{
			System.out.println("The current radius of the circle is 4.0, please type '0.0' to continue.");
			//opens scanner
			double input = myReader.nextDouble();
			//calls the circle class and makes a new circle in this class with a radius
			Circle circOne = new Circle (4.0);
			//declares what the original radius is
			double r = 4.0;
			//getter
			circOne.getRadius();
			//setter
			circOne.setRadius(4.0);
			
			//for loop that will run 5 times
			for (int i = 1; i <= 5; i++)
			{
				System.out.println("please input a double:");
				//opens scanner
				input = myReader.nextDouble();
				//will take their double and adds it to the radius
				System.out.println(circOne.getRadius() + input);
				//sets that new sum as the radius
				circOne.setRadius(circOne.getRadius() + input);
				
			}
			//prints what the original radius and new radius is
		System.out.println("Your circle originally had a radius of " + r + " and ended with a radius of " + circOne.getRadius());
		}
		

	
}
