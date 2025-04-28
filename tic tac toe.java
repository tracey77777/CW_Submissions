/**
 *  made by Tracey Ly on April 2nd, 2025 for a tic tac toe game using 2d arrays
 */
import java.util.Scanner;
public class Tic_Tac_Toe 
{
	static Scanner gameReader = new Scanner (System.in);
	
	public static void main(String[] args) 
	{
	
		//intro & start
		System.out.println("THIS IS TIC TAC TOE, I KNOW YOU KNOW HOW TO PLAY SO WE'RE STARTING NOW.");
		System.out.println("Oh wait, here's your grid.");
		System.out.println(" ");

		//makes the grid
		String [][] gridValues =
		{
			{"__", "__", "__"}, 
			{"__", "__", "__"}, 
			{"__", "__", "__"}
		};
		
		//calls the methods
		printGrid(gridValues);
		playerO(gridValues);
		//playerX(gridValues);
		//nextO(gridValues); 
		//nextX(gridValues);
		gameOver(gridValues);

	}
	
	//prints the grid
	public static void printGrid(String [][] nums) 
	{
		//will go through the whole array and print it 
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j< nums.length; j++)
			{
				System.out.print(nums [i][j]);
				System.out.print(", ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
	}
	
	//player O's first move
	public static void playerO(String [][] nums)
	{
		
		System.out.println("Please go first, you will be 'O'. Place your 'O' anywhere on the grid once. ");
		System.out.println("Please use directions: 'top left corner', 'top middle', 'top right corner', 'left middle', 'middle', 'right middle',");
		System.out.println("'bottom left corner', 'bottom middle', or 'bottom right corner'.");
		//scanner
		String playerO = new String (gameReader.nextLine());
		//gameReader.nextLine();
		//whatever they choose, it will update and print on the grid
		if (playerO.equals("middle"))
		{
			nums[1][1] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("top left corner"))
		{
			nums[0][0] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("top middle"))
		{
			nums[0][1] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("top right corner"))
		{
			nums[0][2] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("left middle"))
		{
			nums[1][0] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("right middle"))
		{
			nums[1][2] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("bottom left corner"))
		{
			nums[2][0] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("bottom middle"))
		{
			nums[2][1] = "O";
			printGrid(nums);
		}
		
		else if (playerO.equals("bottom right corner"))
		{
			nums[2][2] = "O";
			printGrid(nums);
		}
		//will allow the game to go to player X's first turn
		playerX(nums);
		
	}
	
	//player X's first move
	public static void playerX(String [][] nums)
	{
		
		System.out.println("Next player please! You will be 'X'. Place your 'X' anywhere on the grid once. Don't place it anywhere that already has a character there");
		System.out.println("Please use directions: 'top left corner', 'top middle', 'top right corner', 'left middle', 'middle', 'right middle',");
		System.out.println("'bottom left corner', 'bottom middle', or 'bottom right corner'.");		
		System.out.println("");
		//same
		String playerX = new String (gameReader.nextLine());
		//same but also making sure they can't choose the same thing
		if (playerX.equals("middle") && nums[1][1] != "O")
		{
			nums[1][1] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("top left corner") && nums[0][0] != "O")
		{
			nums[0][0] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("top right corner") && nums[0][2] != "O")
		{
			nums[0][2] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("top middle") && nums[0][1] != "O")
		{
			nums[0][1] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("left middle") && nums[1][0] != "O")
		{
			nums[1][0] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("right middle") && nums[1][2] != "O")
		{
			nums[1][2] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("bottom left corner") && nums[2][0] != "O")
		{
			nums[2][0] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("bottom middle") && nums[2][1] != "O")
		{
			nums[2][1] = "X";
			printGrid(nums);
		}
		
		else if (playerX.equals("bottom right corner") && nums[2][2] != "O")
		{
			nums[2][2] = "X";
			printGrid(nums);
		}

	// repeated errors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		else if (playerX.equals("middle") && nums[1][1] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("top left corner") && nums[0][0] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("top right corner") && nums[0][2] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("top middle") && nums[0][1] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("left middle") && nums[1][0] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("right middle") && nums[1][2] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("bottom left corner") && nums[2][0] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("bottom middle") && nums[2][1] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		
		else if (playerX.equals("bottom right corner") && nums[2][2] == "O")
		{
			System.out.println("Umm, you can't go there silly. You lose a turn.");
			System.out.println("");
		}
		//will allow the game to go back and forth
		nextO(nums);
		
		
	}
	
	
		
		
//separator ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		
		
		
		//player O's next turns
		public static void nextO(String [][] nums)
		{
			
			System.out.println(" --- PLAYER O's TURN.");
			System.out.println("Please use directions: 'top left corner', 'top middle', 'top right corner', 'left middle', 'middle', 'right middle',");
			System.out.println("'bottom left corner', 'bottom middle', or 'bottom right corner'.");
			//same
			String playerO = new String (gameReader.nextLine());
			//gameReader.nextLine();
			//same
			if (playerO.equals("middle") && nums[1][1] != "O" && nums[1][1] != "X")
			{
				nums[1][1] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("top left corner") && nums[0][0] != "O" && nums[0][0] != "X")
			{
				nums[0][0] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("top middle") && nums[0][1] != "O" && nums[0][1] != "X")
			{
				nums[0][1] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("top right corner") && nums[0][2] != "O" && nums[0][2] != "X")
			{
				nums[0][2] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("left middle") && nums[1][0] != "O" && nums[1][0] != "X")
			{
				nums[1][0] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("right middle") && nums[1][2] != "O" && nums[1][2] != "X")
			{
				nums[1][2] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("bottom left corner") && nums[2][0] != "O" && nums[2][0] != "X")
			{
				nums[2][0] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("bottom middle") && nums[2][1] != "O" && nums[2][1] != "X")
			{
				nums[2][1] = "O";
				printGrid(nums);
			}
			
			else if (playerO.equals("bottom right corner") && nums[2][2] != "O" && nums[2][2] != "X")
			{
				nums[2][2] = "O";
				printGrid(nums);
			}
			
			// repeated errors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
			else if (playerO.equals("middle") && nums[1][1] == "O" || nums[1][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("top left corner") && nums[0][0] == "O" || nums[0][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("top middle") && nums[0][1] == "O" || nums[0][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("top right corner") && nums[0][2] == "O" || nums[0][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("left middle") && nums[1][0] == "O" || nums[1][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("right middle") && nums[1][2] == "O" || nums[1][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("bottom left corner") && nums[2][0] == "O" || nums[2][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("bottom middle") && nums[2][1] == "O" || nums[2][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerO.equals("bottom right corner") && nums[2][2] == "O" || nums[2][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			//will allow the game to go back and forth and detect a win
			if (!gameOver(nums))
			{
				nextX(nums);
			}

		}
		
		
		//player X's next turns
		public static void nextX(String [][] nums)
		{
			
			System.out.println(" --- PLAYER X's TURN.");
			System.out.println("Please use directions: 'top left corner', 'top middle', 'top right corner', 'left middle', 'middle', 'right middle',");
			System.out.println("'bottom left corner', 'bottom middle', or 'bottom right corner'.");		
			System.out.println("");
			//same
			String playerX = new String (gameReader.nextLine());
			//same
			if (playerX.equals("middle") && nums[1][1] != "O" && nums[1][1] != "X")
			{
				nums[1][1] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("top left corner") && nums[0][0] != "O" && nums[0][0] != "X")
			{
				nums[0][0] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("top middle") && nums[0][1] != "O" && nums[0][1] != "X")
			{
				nums[0][1] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("top right corner") && nums[0][2] != "O" && nums[0][2] != "X")
			{
				nums[0][2] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("left middle") && nums[1][0] != "O" && nums[1][0] != "X")
			{
				nums[1][0] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("right middle") && nums[1][2] != "O" && nums[1][2] != "X")
			{
				nums[1][2] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("bottom left corner") && nums[2][0] != "O" && nums[2][0] != "X")
			{
				nums[2][0] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("bottom middle") && nums[2][1] != "O" && nums[2][1] != "X")
			{
				nums[2][1] = "X";
				printGrid(nums);
			}
			
			else if (playerX.equals("bottom right corner") && nums[2][2] != "O" && nums[2][2] != "X")
			{
				nums[2][2] = "X";
				printGrid(nums);
			}
			
			// repeated errors ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			
			else if (playerX.equals("middle") && nums[1][1] == "O" || nums[1][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("top left corner") && nums[0][0] == "O"|| nums[0][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("top middle") && nums[0][1] == "O" || nums[0][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("top right corner") && nums[0][2] == "O" || nums[0][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("left middle") && nums[1][0] == "O" || nums[1][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("right middle") && nums[1][2] == "O" || nums[1][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("bottom left corner") && nums[2][0] == "O" || nums[2][0] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("bottom middle") && nums[2][1] == "O" || nums[2][1] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			
			else if (playerX.equals("bottom right corner") && nums[2][2] == "O" || nums[2][2] == "X")
			{
				System.out.println("Umm, you can't go there silly. You lose a turn.");
				System.out.println("");
			}
			//will allow the game to go back and forth and detect a win
			if (!gameOver(nums))
			{
				nextO(nums);
			}
		}
	
		//vertical wins
		public static boolean gameOver (String [][] arr)
		{
			for (int i = 0; i < arr.length; i++)
			{
				//player O wins
				if (arr[0][i] == "O" && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
				{
					//player O wins vertical
					System.out.println("Player O, YOU WIN!");
					return true;
				}
				
				else if (arr[0][i] == "X" && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
				{
					//player X wins vertical
					System.out.println("Player X, YOU WIN!");
					return true;
				}
			}
			
			//horizontal win
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i][0] == "O" && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
				{
					//player O wins horizontal
					System.out.println("Player O, YOU WIN!");
					return true;
				}
				
				else if (arr[i][0] == "X" && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
				{
					//player X wins horizontal
					System.out.println("Player X, YOU WIN!");
					return true;
				}
			}
			
			//diagonal wins
			
			//bottom left to top right diagonal
			
			if (arr[2][0] == "O" && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
			{
				//player O wins diagonal
				System.out.println("Player O, YOU WIN!");
				return true;

			}
			
			else if (arr[2][0] == "X" && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
			{
				//player X wins diagonal
				System.out.println("Player X, YOU WIN!");
				return true;
			}
			
			//bottom right to top left diagonal
			
			if (arr[0][0] == "O" && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
			{
				//player O wins diagonal
				System.out.println("Player O, YOU WIN!");
				return true;

			}
			
			else if (arr[0][0] == "X" && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
			{
				//player X wins diagonal
				System.out.println("Player X, YOU WIN!");
				return true;
			}
			
			return false;
			
		}

}
