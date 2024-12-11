/*
 * Made December 11, 2024, AP CS A String/Loops Quiz Corrections by Tracey Ly
 */
public class Quiz_Corrections_2 
{

	public static void main(String[] args) 
	{
		
	String str = "backwards";
	char s;
	System.out.print( giveBackwards(str) );
		
	}
	
	public static String giveBackwards (String str)
	{
	String result = "";
	for (int i = (str.length()-1); i >= 0; i--)
	{
		char s = str.charAt(i);
		result += s;
		
	}

	return result;
	
	}

}

