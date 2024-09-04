
public class Practicing_System_and_Primitives {

	public static void main(String[] args) {
		//Task  1: Print out your name using the letter "O" in ASCII art
		System.out.println("OOOOO  OOOO     OO     OO     OOOOO   OO    OO");
		System.out.println("  O    O   O   O  O   O  O    O        O    O");
		System.out.println("  O    O  O    O  O   O       O         O  O");
		System.out.println("  O    O O     OOOO   O       OOOOO      OO");
		System.out.println("  O    O  O    O  O   O       O          OO");
		System.out.println("  O    O   O   O  O   O  O    O          OO");
		System.out.println("  O    O    O  O  O    OO     OOOOO      OO");
		
		//Task  2: Write code to compute the following math problem:
		// 6.0 x 3.5 - 1.5 x 5
		// -------------------
		//     55.6 - 30.2
		// Example output: 0.531496062992126
		System.out.println(((6.0*3.5)-(1.5*5))/(55.6-30.2));
		// Task 3: Write adaptable code that will print out the circumference and area of a circle that has a radius of 4.0. (Hint: the value of pi is 3.14 and it never changes)
		final double pi=(3.14);
		double circ=(2.0*4.0);
		int area=(4*4);
		System.out.print("The circumference of the circle is ");
		System.out.print(circ*pi);
		System.out.print(" and the area of the circle is ");
		System.out.print(area*pi);
		}

}
