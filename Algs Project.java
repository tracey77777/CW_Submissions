/**
 * made a while ago, maybe March 3rd, by Tracey Ly for the Algorithms Project
 */
public class Algs_Project 
{

	public static void main(String[] args) 
	{
		// makes a string for the string array (which will be used for the algs)
		String[] stringArr;
		// what the elements of the string are
		int [] testArr = {18,0,2,4,2,5,5};
		//prints the smallest number in the arr
		System.out.println(smallestNum(testArr));
		
		//prints the index of the smallest # in the arr
		System.out.println(returnMinIndex(testArr));
		//prints the avg of the arr
		System.out.println(average(testArr));
		//prints true if all numbers in arr are even and false if otherwise
		System.out.println(evenOrOdd(testArr));
		//instantiates method of if there are two consecutive 5's in the arr, it'll change them to zeros
		ifCon5(testArr);
		//separates the previous printed from the next
		System.out.println(" ");
		//prints true if any number is in the array 3 times consecutively
		System.out.println(if3Times(testArr));
		//prints how many time a chosen int shows up in the arr
		System.out.println(findBlankTimes(testArr, 2));
		// instantiates method of shifting each element to the right once
		shiftRight(testArr);
		//separates the previous printed from the next
		System.out.println(" ");
		//instantiates method of sorting the elements in number order
		insertionSort(testArr);
	}
	
	public static int smallestNum(int [] nums)
	{
		//sets min to the first index to compare to the next later
		int min = nums[0];
		//for loop and if statement which will check each element and compare to see if it's less than the previous
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i] < min)
			{
				min = nums[i];
			}
		}
	//returns the min which will be the smallest value once the for loop is done
		return min;
	}
	
	public static int returnMinIndex(int [] nums)
	{
		//same as above
		int min = nums[0];
		//index of the minimum MINDEX HAHHAHAHAHA
		int mindex = 0;
		//for loop and if statement which basically does the same as smallest num but also returns the index of it
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i] < min)
			{
				min = nums[i];
				mindex = i;
			}
			
			
		}
	
		return mindex;
	}
	
	
	public static int average(int [] nums)
	{
		//variables that will be used in the for loop body
		int add = 0;
		int avg = 0;
		for (int i = 0; i < nums.length; i++)
		{
			//add = nums[i] + nums[i+1];
			//makes add plus where the traverser is 
			add = add + nums[i];
		}
		//formula for average 
		avg = add/nums.length;
		return avg;
	}
		
	public static boolean evenOrOdd(int[] nums)
	{
		//declaring this early
		boolean odd = false;
		for (int i = 0; i < nums.length - 1; i++)
		{
			//if there's a variable leftover after dividing by two, it's not even, aka it's false, aka it's odd
			if (nums[i] % 2 != 0)
			{
				return false;
			}
			
		}
	
		return true;
	}
	
	public static void ifCon5 (int[] nums)
	{
		//for loop where if there's a 5 next to another 5, set them to 0
		for (int i = 0; i < nums.length - 1; i++)
		{
			if (nums[i]== 5 && nums[i+1]==5)
			{
				 nums[i] = 0;
				 nums[i+1] = 0;
			}
			
		}
		
		for (int i = 0; i <= nums.length-1; i++)
		  {
			//this prints it out
		    System.out.print(nums[i]);
		    System.out.print(",");
		  }
	
		//return testArr;
	}
	
	
	public static boolean if3Times (int[] nums)
	{
		for (int i = 0; i < nums.length - 2 ; i++)
		{
			//if any number shows  up 3 times consecutively, return true
			if (nums[i]== nums[i+1] && nums[i+1]== nums[i+2])
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	public static int findBlankTimes (int[] nums, int x)
	{
		//counter will count how many times int x (in my case: 2) shows up in the array
		int counter = 0;
		for (int i = 0; i < nums.length - 1 ; i++)
		{
			//everytime int x shows up in the array, counter goes up one
			if (nums[i]== x)
			{
				counter++;
				
			}
			
		}
		return counter;
				
	}
	
	
	
	public static void backwards (int[] nums)
	{
		//makes a copy of the original array
		int copyArr[] = new int [nums.length];
		for(int i = 0; i < nums.length; i++)
		{
			//makes each number in the copy array the same as the original cause the copy array starts as all zeros
			copyArr[i] = nums[i];
		}
		//instantiating variable early
		int x = 0;
		//goes through array backwards
		for(int i = nums.length - 1; i >= 0; i--)
		{
			//makes it backwards
			nums[i] = copyArr[x];
			x++;
		}
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
