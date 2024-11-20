/* 
 * This is my Wordle project and I'm not sure when it was created but I'm commenting on November 20th, 2024.
 */
import java.util.Scanner;
public class Wordle {

	static Scanner gameReader = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
		String solution = new String ("smart");

		System.out.println("Play my Wordle or else! Remember, no words that are five letters long and no repeating letters. ");
		System.out.println("Make a guess in lowercase: ");
		
		playGame(solution);
	}

	/**
	 * this method will check if the player inputs an invalid or incompatible word as their guess
	 * @return
	 */
	public static String guessErrors()
	{
		//Scanner gameReader = new String (gameReader.next());
		
		String wrongGuess = new String (gameReader.next());
		
		if (wrongGuess.length() != 5)
		{
			System.out.println("That word is not 5 letters.");
		}
		
		else if (wrongGuess.charAt(0) == wrongGuess.charAt(1) || wrongGuess.charAt(0) == wrongGuess.charAt(2))
		{
			System.out.println("That word has repeating letters, please guess again.");
		}
		
		else if (wrongGuess.charAt(1) == wrongGuess.charAt(2) || wrongGuess.charAt(1) == wrongGuess.charAt(3))
		{
			System.out.println("That word has repeating letters, please guess again.");
		}
		
		else if (wrongGuess.charAt(2) == wrongGuess.charAt(3) || wrongGuess.charAt(2) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters, please guess again.");
		}
		else if (wrongGuess.charAt(3) == wrongGuess.charAt(4))
		{
			System.out.println("That word has repeating letters, please guess again.");
		}
			return wrongGuess;
	
	}
	
	/**
	 * this method is basically the body of the whole game, it will check each letter in the player's guess and compare it to the "correct" word - which is "smart" - and will put a ? if that letter is in smart but in the wrong spot, put X if that letter is completely wrong, and will just print the letter if it's in the word smart and in the right spot.
	 * if the player is correct first try, then it will print "Congrats you won!"
	 * @param solution
	 */
	public static void playGame (String solution)
	{
		//Scanner gameReader = new Scanner (System.in);
		
		String guess = guessErrors();
		
		//System.out.println("Make a guess in lowercase: ");
		//String playerGuess = new String (gameReader.next());
		
		if (guess.charAt(0) == solution.charAt(0))
		{
			System.out.print(solution.charAt(0));
		}
		
		else if (guess.charAt(0) == solution.charAt(1) || guess.charAt(0) == solution.charAt(2) || guess.charAt(0) == solution.charAt(3) || guess.charAt(0) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(0) != solution.charAt(0))
		{
			System.out.print("X");
		}
		
		
		
		
		if (guess.charAt(1) == solution.charAt(1))
		{
			System.out.print(solution.charAt(1));
		}
		
		else if (guess.charAt(1) == solution.charAt(0) || guess.charAt(1) == solution.charAt(2) || guess.charAt(1) == solution.charAt(3) || guess.charAt(1) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(1) != solution.charAt(1))
		{
			System.out.print("X");
		}
		
		
		
		
		
		if (guess.charAt(2) == solution.charAt(2))
		{
			System.out.print(solution.charAt(2));
		}
	
		else if (guess.charAt(2) == solution.charAt(0) || guess.charAt(2) == solution.charAt(1) || guess.charAt(2) == solution.charAt(3) || guess.charAt(2) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(2) != solution.charAt(2))
		{
			System.out.print("X");
		}
		
		
		
		
		
		if (guess.charAt(3) == solution.charAt(3))
		{
			System.out.print(solution.charAt(3));
		}
		
		else if (guess.charAt(3) == solution.charAt(0) || guess.charAt(3) == solution.charAt(1) || guess.charAt(3) == solution.charAt(2) || guess.charAt(3) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else if (guess.charAt(3) != solution.charAt(3))
		{
			System.out.print("X");
		}
		
	
		
		
		
		if (guess.charAt(4) == solution.charAt(4))
		{
			System.out.println(solution.charAt(4));
		}
		
		else if (guess.charAt(4) == solution.charAt(0) || guess.charAt(4) == solution.charAt(1) || guess.charAt(4) == solution.charAt(2) || guess.charAt(4) == solution.charAt(3))
		{
			System.out.println("?");
		}
		
		else if (guess.charAt(4) != solution.charAt(4))
		{
			System.out.println("X");
		}
		
		
		
		
		
		
		if (guess.charAt(0) == solution.charAt(0) && guess.charAt(1) == solution.charAt(1) && guess.charAt(2) == solution.charAt(2) && guess.charAt(3) == solution.charAt(3) && guess.charAt(4) == solution.charAt(4))
		{
			System.out.println("Congrats you won!");
		}
		else 
		{
			playGame(solution);
		}
	}
	
}
