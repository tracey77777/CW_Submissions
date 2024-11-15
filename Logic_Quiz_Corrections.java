/*
 * Made Oct. 30, 2024 by Tracey Ly to correct my quiz.
 */
public class Quiz_Corrections {

	public static void main(String[] args) {
		
		//this will print if what is passed is a leap year or not
		
		System.out.print(findIfIsLeapYear(10));
	}
	/**
	 * This method determines if a given year is a leap year  if the year is divisible by 4. If the year is also divisible by 100, then it is only a leap year if it is also divisible by 400.
	 * @param year
	 * @return
	 */
		public static boolean findIfIsLeapYear( int year )

		{

		     if (year % 400 == 0)
		     {
		    	 return true;
		     }
		     else if (year % 100 == 0)
		     {
		    	 return false;
		     }
		     else if (year % 4 == 0) 
		     {
		    	 return true;
		     }
		     else
		     {
		    	 return false;
		     }
		}

}
 
