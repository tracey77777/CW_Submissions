//factorial
public int factorial(int n) 
{
	if (n == 1)
	return 1;
	return n*factorial(n-1);  
}


//bunnyears
public int bunnyEars(int bunnies)
{
  if (bunnies == 0)
	return 0;
	return 2 + bunnyEars(bunnies-1);
}

//fibonacci
public int fibonacci(int n) 
{
  if (n < 2)
	return n;
	return fibonacci(n-2) + fibonacci(n-1);
}



