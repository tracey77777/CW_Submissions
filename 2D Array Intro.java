/**
 * made march 28, 2025 bv Tracey Ly for the 2D array intro assignment
 */
public class TwoD_Array_Intro_Assignment {

	public static void main(String[] args) 
	{
		//1
		int [][] gridNums = new int [4][6];
		
		//2
		int[][] gridValues = new int [3][3];
		
		//row 1
		gridValues[0][0] = 4;
		gridValues[0][1] = 5;
		gridValues[0][2] = 7;
	
		//row 2
		gridValues[1][0] = 2;
		gridValues[1][1] = -1;
		gridValues[1][2] = 8;
	
		//row 3
		gridValues[2][0] = 0;
		gridValues[2][1] = 1;
		gridValues[2][2] = 3;
	
		
		//	{4, 5, 7}, 
		//	{2, -1, 8}, 
		//	{0, 1, 3}
		
		
		//3
		gridNums [0][0] = 17;
		gridValues [0][0] = 17;
		
		
		//4
		gridNums [1][2] = 20;
		gridValues [1][2] = 20;
		
		//5
		gridNums[0][gridNums[0].length-1] = -5;
		gridValues[0][gridValues[0].length-1] = -5;
		
		//6
		gridNums[3][gridNums[0].length-3] = 7;
		gridValues[2][gridValues[0].length-2] = -7;
		
		//7
		gridNums[3][gridNums[0].length-1] = -30;
		gridValues[2][gridValues[0].length-1] = -30;
		
		//8
		printElementFirstRow(gridValues);
		
		
		//9
		printElementFirstColumn(gridValues);
		
		
		//10
		printElementRowMajor(gridValues);
		

		
		//11
		printElementColumnMajor(gridValues);

		
	}
	
	//8
	
	public static int[][] printElementFirstRow(int[][] arr)
	{
		//for loop of array
		for(int i =0;i<=arr[0].length-1; i++)
		{
			//will print whatever 'i' is in the 1st rows
			System.out.println(arr[0][i]);
		}
		//this will return the array
		return arr;
	}
	
	
	//9
	
	public static int[][] printElementFirstColumn(int[][] arr)
	{
		//for loop of array
		for(int i = 0; i<=arr.length-1;i++)
		{
			//will print whatever 'i' is in the 1st columns
			System.out.print(arr[i][0]);
		}
		//this will return the array
		return arr;
		
	}
	
	
	//10 print in row major order
	
	public static int[][] printElementRowMajor(int[][] arr)
	{
		//for loop of array
		for (int i = 0; i<=arr[0].length-1; i++)
		{
			
			//this line of code will run as long as r is less than or equal to length-1
			for(int r=0; r<=arr.length-1;r++)
			{
				//will print whatever 'r' and 'i' is 
				System.out.println(arr[r][i]);
			}
		}
		// then it will return the array
		return arr;
	}
	
	
	
	//11 column major order
	
	public static int[][] printElementColumnMajor(int[][] arr)
	{
		//for loop of the array
		for(int i=0; i<=arr.length-1;i++)
		{
			//for loop for columns
			for(int r=0;r<arr[0].length-1;r++)
			{
				//then this line will print out the i and r
				System.out.println(arr[i][r]);
			}
		}
		// then it will return the array
		return arr;
	}
	
	
	
	

}
