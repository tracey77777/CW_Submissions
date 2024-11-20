/* 
 * This class was made November 13th, 2024 for the Loops Intro Practice
 */
public class Loops_Intro_Practice {

	public static void main(String[] args) 
	{
		String m = "abqcdqefghqqijk";
		char k = 'q';
		System.out.println(countLetters(m,k));
		System.out.println(getFactorial(4));
		System.out.print(getIfRepeats("aabcd"));	
	}

	
	//number 1
	
	/**
	 * this method loops and will count how many times a char (q) shows up in the String (abqcdqefghqqijk)
	 * @param str
	 * @param let
	 * @return
	 */
	public static int countLetters(String str, char let)
	{
		int count = 0;
		for (int i = 0; i < str.length(); i ++) 
		{
			if (let == str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
	//number 2
	
		/**
		 * this method loops and will return the factorial of the int
		 * @param str
		 * @param let
		 * @return
		 */
	
	public static int getFactorial(int count)
	{
		for (int i = count - 1; i > 0; i = i - 1)
		{
			count = count * i;
		}
		return count;
	}
	
	
	
	
	
	
	//number 3
	
		/**
		 * this method loops and will return true if the passed String has two of the same letter next to each other, otherwise, false
		 * @param str
		 * @param let
		 * @return
		 */
	
	public static Boolean getIfRepeats(String str)
	{
		for (int i = 0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				return true;
			}
		}
		
		
		return false;	
		
	}
}
