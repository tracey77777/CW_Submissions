import java.util.ArrayList;
/**
 * made 2/21/25 as the array lists intro by Tracey Ly
 */
public class Array_Lists_Intro 
{

	public static void main(String[] args) 
	{
		//#1 make empty ArrList
		ArrayList empty = new ArrayList();
		
		//#2 makes an integer and string array list  
		ArrayList<Integer> intArrList = new ArrayList <Integer>();
		
		ArrayList<String> stringArrList = new ArrayList <String>();
		
		//#3 adds 123 to intArrList
		intArrList.add (1);
		intArrList.add (2);
		intArrList.add (3);
		//adds these names to stringArrList
		stringArrList.add ("Alice");
		stringArrList.add ("Bob");
		stringArrList.add ("Charlie");
	
		
		//#4 adds 5 after the 2nd index
		intArrList.add (2, 5);
		//adds derek after the 1st index
		stringArrList.add(1, "Derek");
		
		//#5 prints the second last last element of both
		System.out.println(intArrList.get(1));
		System.out.println(intArrList.get(intArrList.size()-1));
		System.out.println(stringArrList.get(1));
		System.out.println(stringArrList.get(stringArrList.size()-1));
		
		//#6 changes first int to 0 and string to zero adn then will print the before and after
		System.out.println(intArrList.get(0));
		System.out.println(intArrList.set(0, 0));
		System.out.println(intArrList.get(0));
		System.out.println(stringArrList.get(0));
		System.out.println(stringArrList.set(0, "Zero"));
		System.out.println(stringArrList.get(0));
		
		//#7 deletes the last in both and prints wjat they were before
		System.out.println(intArrList.get(intArrList.size()-1));
		System.out.println(intArrList.remove(intArrList.size()-1));
		System.out.println(stringArrList.get(stringArrList.size()-1));
		System.out.println(stringArrList.remove(stringArrList.size()-1));
		
		
		
		
	}
	
	
	

}
