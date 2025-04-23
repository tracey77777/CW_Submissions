
public class TwoD_Array_Sorter 
{

	public static void main(String[] args) 
	{
		//makes the 2D array
		double [][] gridNums =
			{
				{1.0, 2.0, 3.0}, 
				{4.0, 5.0, 6.0}, 
				{7.0, 8.0, 9.0}
			};
		
		//calls the methods so that they can print
		leftRightUpDown(gridNums);
		//visually separates them
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		upDownLeftRight(gridNums);

	}
	
	
	public static void leftRightUpDown (double[][] arr)
	{
		//prints row major order then column major order
		for(int i=0; i<=arr[0].length-1;i++)
		{
			//for loop for columns
			for(int r=0;r<arr[0].length;r++)
			{
				//then this line will print out the i and r
				System.out.println(arr[i][r]);
			}
		}
	}
	
	
	
	
	
	
	public static void upDownLeftRight (double[][] arr)
	{
		//prints column major order then row major order
		for (int i = 0; i<=arr[0].length-1; i++)
		{
			
			//this line of code will run as long as r is less than or equal to length-1
			for(int r=0; r<=arr[0].length-1;r++)
			{
				//will print whatever 'r' and 'i' is 
				System.out.println(arr[r][i]);
			}
		}
	}

	
	
	
	
	
}
