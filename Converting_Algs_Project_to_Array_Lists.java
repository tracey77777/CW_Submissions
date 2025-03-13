import java.util.ArrayList;
/**
 * made by Tracey Ly, March 12, 2025, for the converting algs project to array lists
 */
public class Converting_Algs_Project_to_Array_Lists 
{

	public static void main(String[] args) 
	{
		//makes an array list for an integer
		ArrayList<Integer> intArrList = new ArrayList <Integer>();
		//what is in the array list
		intArrList.add (0);
		intArrList.add (2);
		intArrList.add (4);
		intArrList.add (2);
		intArrList.add (5);
		intArrList.add (5);
		intArrList.add (1);
		//prints the smallest number in the arr
		System.out.println(smallestNum(intArrList));
		//prints the index of the smallest # in the arr
		System.out.println(returnMinIndex(intArrList));
		//prints the avg of the arr
		System.out.println(average(intArrList));
		//prints true if all numbers in arr are even and false if otherwise				
		System.out.println(evenOrOdd(intArrList));
		//instantiates method of if there are two consecutive 5's in the arr, it'll change them to zeros
		ifCon5(intArrList);
		//separates the previous printed from the next
		System.out.println(" ");
		//prints true if any number is in the array 3 times consecutively
		System.out.println(if3Times(intArrList));
		//prints how many time a chosen int shows up in the arr
		System.out.println(findBlankTimes(intArrList, 2));
		//prints array backwards
		backwards(intArrList);
		//separates the previous printed from the next
		System.out.println(" ");
		// instantiates method of shifting each element to the right once
		shiftRight(intArrList);
		//separates the previous printed from the next
		System.out.println(" ");
		//instantiates method of sorting the elements in number order
		insertionSort(intArrList);

	}
	
	public static int smallestNum (ArrayList <Integer> nums)
	{
		int min = nums.get(0);
		//for loop and if statement which will check each element and compare to see if it's less than the previous
		for (int i = 0; i < nums.size() - 1; i++)
		{
			if (nums.get(i) < min)
			{
				min = nums.get(i);
			}
		}
	//returns the min which will be the smallest value once the for loop is done
		return min;
	
	}
	
	
	public static int returnMinIndex (ArrayList <Integer> nums)
	{
		int min = nums.get(0);
		//index of the minimum MINDEX HAHHAHAHAHA
		int mindex = 0;
		//for loop and if statement which basically does the same as smallest num but also returns the index of it
		for (int i = 0; i < nums.size() - 1; i++)
		{
			if (nums.get(i) < min)
			{
				min = nums.get(i);
				mindex = i;
			}
			
			
		}
	
		return mindex;
	}
	
	
	
	public static int average (ArrayList <Integer> nums)
	{
		//variables that will be used in the for loop body
		int add = 0;
		int avg = 0;
		for (int i = 0; i < nums.size(); i++)
			{
				//add = nums[i] + nums[i+1];
				//makes add plus where the traverser is 
				add = add + nums.get(i);
			}
		//formula for average 
		avg = add/nums.size();
		return avg;
	}
	
	
	
	public static boolean evenOrOdd (ArrayList <Integer> nums)
	{
		//declaring this early
		boolean odd = false;
		for (int i = 0; i < nums.size() - 1; i++)
			{
				//if there's a variable leftover after dividing by two, it's not even, aka it's false, aka it's odd
				if (nums.get(i) % 2 != 0)
				{
					return false;
				}
					
			}
			
			return true;
	}
	
	
	
	public static void ifCon5 (ArrayList <Integer> nums)
	{
		//for loop where if there's a 5 next to another 5, set them to 0
		for (int i = 0; i < nums.size() - 1; i++)
			{
				if (nums.get(i) == 5 && nums.get(i+1) ==5)
				{
					 nums.set((i), 0);
					 nums.set((i+1), 0);
				}
					
			}
				
		for (int i = 0; i <= nums.size()-1; i++)
			  {
				//this prints it out
			    System.out.print(nums.get(i));
			    System.out.print(",");
			  }
	}
	
	
	public static boolean if3Times (ArrayList <Integer> nums)
	{
		for (int i = 0; i < nums.size() - 2 ; i++)
		{
			//if any number shows  up 3 times consecutively, return true
			if (nums.get(i)== nums.get(i+1) && nums.get(i+1)== nums.get(i+2))
			{
				return true;
			}
			
		}
		return false;
	}
	
	
	public static int findBlankTimes (ArrayList <Integer> nums, int x)
	{
		//counter will count how many times int x (in my case: 2) shows up in the array
		int counter = 0;
		for (int i = 0; i < nums.size() - 1 ; i++)
			{
				//everytime int x shows up in the array, counter goes up one
				if (nums.get(i)== x)
				{
					counter++;
						
				}
					
			}
			return counter;
	}
	
	
	public static void backwards (ArrayList <Integer> nums)
	{
		//makes a copy of the original array
		int copyArr[] = new int [nums.size()];
		for(int i = 0; i < nums.size(); i++)
			{
				//makes each number in the copy array the same as the original cause the copy array starts as all zeros
				copyArr[i] = nums.get(i);
			}
		//instantiating variable early
		int x = 0;
		//goes through array backwards
		for(int i = nums.size() - 1; i >= 0; i--)
			{
				//makes it backwards
				nums.set((i), copyArr[x]);
				x++;
			}
		//goes through each element
		for (int num: nums)
			{
				//prints it out
				System.out.print(num + ",");
			}
	}
	
	
	public static void shiftRight (ArrayList <Integer> nums)
	{
		//copy of the array
		int[] copyArr = new int [nums.size()];
		//saves the last element of the array to use for later and to avoid an out of bounds error
		int lastElement = nums.get(nums.size()-1);
		//for loop will go through the array backwards
		for(int i = copyArr.length - 1; i > 0; i--)
			{
				//the copyArr will be whatever is before that index but of the original array
				copyArr[i] = nums.get(i-1);
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
	
	
	public static void insertionSort (ArrayList <Integer> nums)
	{
		for (int i = 1; i < nums.size(); i++)
		{
			//insert will be where the traverser is
			int insert = nums.get(i);
			//x is whatever is right before the traverser
			int x = i - 1;
			//while loop is if x is greater than or equal to 0 AND if whatever x is, is greater than insert then (continues at the next comment)
			while (x >= 0 && nums.get(x) > insert)
			{
				//then what's right after x will equal x
				nums.set((x+1), nums.get(x));
				x--;
			}
			//whatever's after x is equal to insert
			nums.set((x+1), insert);
		}
		//will go through each element 
		for (int num: nums)
		{
			//prints it out
			System.out.print(num + ",");
		}
	}
	
	
	

}
