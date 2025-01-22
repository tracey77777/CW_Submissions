

public class Altering_Arrays {

	public static void main(String[] args) 
	{
		
		int[] nums = {5, 0, 8, 20};
		
		

	}

	public static int[] subtract5FromAll4(int [] nums)
	{
		int [] copyArr = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
		{
			copyArr[i] = nums[i] - 5;
		}
	
		return copyArr;
	}
	
	
}







