
public class Bubble_Sort 
{

	public static void main(String[] args) 
	{
		
		
			

	}
	
	
	
public static void bubbleSort(int[] nums)
{
	//to make sure the while loop triggers
	int counter = 3;
	while (counter != 0)
	{
		//so the counter starts at 0
		counter = 0;
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i] > nums [i+1])
			{
				int temp = nums [i];
				nums [i] = nums [i+1];
				nums [i+1] = temp;
				counter ++;
			}
		}
	}
 }


}
