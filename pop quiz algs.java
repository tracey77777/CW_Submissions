/**
 * this is my pop quiz for algorithms made on March 11, 2025 by Tracey Ly 
 */
public class pop_quiz_algs 
{

	public static void main(String[] args) 
	{
		
		// makes a string for the string array (which will be used for the algs)
		String[] stringArr;
		// what the elements of the string are
		int [] testArr = {1,2,3,4,5};
		
		shiftRight(testArr);
		System.out.println(" ");
		insertionSort(testArr);

	}
	
		public static void shiftRight(int[] nums)
		{
			//copy of the array
			int[] copyArr = new int [nums.length];
			//saves the last element of the array to use for later and to avoid an out of bounds error
			int lastElement = nums[nums.length-1];
			//for loop will go through the array backwards
			for(int i = copyArr.length - 1; i > 0; i--)
				{
				//the copyArr will be whatever is before that index but of the original array
					copyArr[i] = nums [i-1];
				}
			//the first index of the copyArr is the last element of the original array
			copyArr[0] = lastElement;
			
			//goes through each element
			for (int num: copyArr)
				{
				//prints it out
					System.out.print(num + ",");
				}
		}
		
		
		public static void insertionSort(int[] nums)
		{
			for (int i = 1; i < nums.length; i++)
			{
				//insert will be where the traverser is
				int insert = nums [i];
				//x is whatever is right before the traverser
				int x = i - 1;
				//while loop is if x is greater than or equal to 0 AND if whatever x is, is greater than insert then (continues at the next comment)
				while (x >= 0 && nums[x] > insert)
				{
					//then what's right after x will equal x
					nums[x + 1] = nums [x];
					x--;
				}
				//whatever's after x is equal to insert
				nums [x + 1] = insert;
			}
			//will go through each element 
			for (int num: nums)
			{
				//prints it out
				System.out.print(num + ",");
			}
		}

}
