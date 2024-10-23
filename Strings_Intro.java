/* 
 * My name is Tracey Ly and I made this class to practice Strings on Oct. 16, 2024. I'm practicing using scanners, understanding chars, indexes, and substrings.
 */

import java.util.Scanner;
public class Strings_Intro {

	public static void main(String[] args)
	{
		// This will just tell the person testing my code where to write their string.
		System.out.println("Imput a word 6 letters or longer below:");
		
		//Scanner
		
		Scanner myReader = new Scanner (System.in);
		
		//creating a string to use in the below code
		
		String myWord = new String (myReader.next());
		
		// to let the "printSecondAndLastLetter" run
		
		printSecondAndLastLetter(myWord);
		
		
		// print statements for each method
		
		
		System.out.println("The second character is " + myWord.charAt(2));
		
		
		
		
		System.out.println("The last character is " + myWord.charAt(6));
		
		
		
		
		System.out.println("The index of the first 'e' is at " + findTheE(myWord));
		
		
		
		
		System.out.println("The length of this string is " + getLength(myWord));
		
		
		
		
		System.out.println("The first three characters are " + myWord.substring(0,3));
		
		
		
		
		System.out.print("The first three characters are " + myWord.substring(myWord.length()-3, myWord.length()));
		
		// closing Scanner
		
		myReader.close();
		

	}
	
	/**
	 * this method will print the second and last letter of a string using chars
	 * @param myWord
	 */
	
    public static void printSecondAndLastLetter(String myWord) 
    {
    	
    }
   
    /**
     * this method will find the first "e" in a string using index
     * @param myWord
     * @return index of "e"
     */
    
    public static int findTheE(String myWord) 
    {
    	return(myWord.indexOf('e'));
    }
    
    /**
     * this method states the length of a string
     * @param myWord
     * @return the length of the string
     */
    
    public static int getLength(String myWord)
    {
    	return(myWord.length());
    }
    
    /**
     * this method prints the first and last three letters of a string
     * @param myWord
     */
    
    public static void printFirstAndLastThree(String myWord)
    {
    	
    }
}
