/*
 * This is my code to a Monty Hall game, made November 6th, 2024, by Tracey Ly. A Monty Hall game is a game where the player will be presented with options like 3 doors and they have to choose the randomly chosen "winning" door. They get an option to switch their choice
 */

import java.util.Scanner;
//scanner
public class Monty_Hall 

{
	//this opens a scanner
	static Scanner myReader = new Scanner (System.in);
	// this assigns ints to methods
	public static void main(String[] args)
	{
		int winDoor = pickRandomDoor();
		int playerDoor = pickPlayerDoor();
		int wrongDoor = returnWrongDoor(playerDoor, winDoor);
		int switchDoor = switchDoor(playerDoor, winDoor, wrongDoor);
		
		
	}

	/**
	 *  this code will randomly choose a random door between 1-3
	 * @return
	 */
	public static int pickRandomDoor()
	{
		return ((int)(Math.random()*3)+1);
	}
	/**
	 *  this code will ask the player to pick a door and returns which one they chose. If they choose a door not available, it will print "Try again!"
	 * @return
	 */
	public static int pickPlayerDoor()
	{
		
		System.out.println("Please select a door number from 1-3:");
		
		String userInput = myReader.next();
		
		if (userInput.equals("one") || userInput.equals("1"))
		{
			return 1;
		}
		
		else if (userInput.equals("two") || userInput.equals("2"))
		{
			return 2;
		}
		
		else if (userInput.equals("three") || userInput.equals("3"))
		{
			return 3;
		}
		
		else
		{
			System.out.print("Try again! :(");
			return pickPlayerDoor();
		}
		
	
	
	}
	
	
	/**
	 * this code will take the door the player chooses and reveals the "wrong" door accordingly
	 * @param playerDoor
	 * @param winDoor
	 * @return
	 */
	public static int returnWrongDoor(int playerDoor, int winDoor)
	{
		int oneOrThree = (int)(Math.random()*2);
		
		if (playerDoor == 1 && winDoor == 2)
		{
			return 3;
		}
		
		if (playerDoor == 1 && winDoor == 3)
		{
			return 2;
		}
		
		if (playerDoor == 2 && winDoor == 3)
		{
			return 1;
		}
		
		if (playerDoor == 2 && winDoor == 1)
		{
			return 3;
		}
		
		if (playerDoor == 3 && winDoor == 2)
		{
			return 1;
		}
		
		if (playerDoor == 3 && winDoor == 1)
		{
			return 2;
		}
		
		
		
		
		
		if (playerDoor == 1 && winDoor == 1)
		{
			return ((int)(Math.random()*2)+2);
		}
		
		if (playerDoor == 2 && winDoor == 2)
		{
			if (oneOrThree == 0)
			{
				return 1;
			}
			else 
			{
				return 3;
			}
		}
		
		if (playerDoor == 3 && winDoor == 3)
		{
			return ((int)(Math.random()*2)+1);
		}
		return -1;
	}
	
		/**
		 * this method will ask if the player would like to switch doors and will reveal what  door they've been moved to and what the winning door was if they say yes
		 * if the player choose to stay then it will state that then reveal the winning door
		 * if they type anything else that's invalid then it will print "Try again"
		 * @param playerDoor
		 * @param winDoor
		 * @param wrongDoor
		 * @return
		 */

		public static int switchDoor(int playerDoor, int winDoor, int wrongDoor)
		{
		System.out.println("Would you like to switch doors?");
		String switchOrNo = myReader.next();
		//int switchDoor = switchDoor(playerDoor, winDoor, wrongDoor);
		
		if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 1 && wrongDoor == 2)
		{
			System.out.println("You have been moved to door " + 3 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 1 && wrongDoor == 3)
		{
			System.out.println("You have been moved to door " + 2 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 2 && wrongDoor == 3)
		{
			System.out.println("You have been moved to door " + 1 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 2 && wrongDoor == 1)
		{
			System.out.println("You have been moved to door " + 3 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 3 && wrongDoor == 1)
		{
			System.out.println("You have been moved to door " + 2 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("yes") || switchOrNo.equals("Yes") && playerDoor == 3 && wrongDoor == 2)
		{
			System.out.println("You have been moved to door " + 1 + ". The winning door was " + winDoor);
		}
		
		else if (switchOrNo.equals("no") || switchOrNo.equals("No"))
		{
			System.out.println("You stayed with your door, this is the winning door: " + winDoor);
		}
		
		else
		{
			System.out.println("Try again! :( ");
			//System.out.println(switchDoor(playerDoor, winDoor, wrongDoor));
		}
		
		return 0;
		}
		
		/**
		 * this method ends the game if the player's door is the winning door and congratulates them
		 * @param winDoor
		 * @param playerDoor
		 */
		public static void yayDoor (int winDoor, int playerDoor)
		{
			if (winDoor == playerDoor)
			{
				System.out.print("Yay you won!");
			}
		}
		
		
	}
	//close scanner
	
	

	

