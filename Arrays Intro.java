// Create an empty array that is meant to represent doubles. Name it doubArr. Repeat this for arrays that represent ints, booleans, String objects, and Circle objects. 

double[] doubArr;
int[] intArr;
boolean[] booArr;
String[] stringArr;
Circle[] circArr;

// Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.

int[] intArr = {7, -12, 88, -88, 0, 5, 2000};

// Create an array that represents 5 String objects with default values. Name the array fruitsArr. In the comment for this task, state what each element's default value is. State what the default value for ints, doubles, booleans, and any reference data type is as well. 

String[] fruitsArr = new String[5];
//int are 0
//double are 0
//booleans are false
//reference data types is null
//Strings are null

// Change the 2nd element in fruitsArr to "Bapple" .

fruitsArr[1] = "Bapple";

// Change the last element in fruitsArr to "Zanana" . Accomplish this without typing the number "4" and instead accessing the arrays length.

fruitsArr[fruitsArr.length-1] = "Zanana";

// To verify you did number 4 correctly, print out the second element of fruitsArr.

System.out.print(fruitsArr[1]);

// Create a loop that one by one prints out each element in fruitsArr.

for (int i = 0; i <= fruitsArr.length-1; i++)
		  {
		    System.out.print(fruitsArr[i]);
		  }







