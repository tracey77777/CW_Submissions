	
	public static boolean checkForFour4(int[] arr, int a)
	{
		int [] copyArr = arr;
		int count = 0;
		boolean four4 = false;
			for (int i = 0; i < arr.length; i++)
			{
				if (count == 4)
				{
					four4 = true;
				}
				if (a == copyArr[i])
				{
					count++;
				}
			}
			return four4;
	}
