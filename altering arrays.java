
public class Altering_Arrays {

	public static void main(String[] args) 
	{
		
		int[] nums = {5, 0, 8, 20};

	}

	public static int[] subtract5FromAll4(int[] arr)
	{
		int[] copyArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			copyArr[i] = arr[i] - 5;
		}
	
		return copyArr;
	}
	
	
}
