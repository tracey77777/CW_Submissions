import java.util.ArrayList;
/**
 * made on March 12, 2025, by Tracey Ly for the converting arrays to array list assignment
 */
public class converting_array_to_array_list 
{

	public static void main(String[] args) 
	{
		//makes an array list for an integer
		ArrayList<Integer> intArrList = new ArrayList <Integer>();
		//what is in the array list
		intArrList.add (1);
		intArrList.add (2);
		intArrList.add (3);
		intArrList.add (4);
		intArrList.add (5);

	}
	
	public static int checkFor4(ArrayList<Integer> nums)
	{
		//for loop that will go through and check for if there are any fours in the array
		for (int i = 0; i < nums.size() -1; i++)
		{
			if (nums.get(i)== 4)
			{
				//returns the index
				 return i;
			}
			
		}
		//return -1 if there are no fours
		return -1;
	}

	
	
	
	public static void ridAllFives(ArrayList<Integer> nums)
	{
		//for loop that will will delete any fives in that array if found
		for (int i = 0; i < nums.size() -1; i++)
		{
			if (nums.get(i)== 5)
			{
				 nums.remove(i);
			}
			
		}
	}
	
	
	
	
	public static void bubbleSort(ArrayList<Integer> nums)
	{
		//to make sure the while loop triggers
		int counter = 3;
		while (counter != 0)
		{
			//so the counter starts at 0
			counter = 0;
			//for loop goes through and sorts it into numerical order
			for (int i = 0; i < nums.size() - 1; i++)
			{
				if (nums.get(i) > nums.get(i+1))
				{
					int temp = nums.get(i);
					nums.set((i), nums.get(i+1));
					nums.set((i+1), temp);
					counter++;
				}
			}
		}
	}

}





