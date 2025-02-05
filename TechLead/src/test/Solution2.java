package test;

import java.util.Scanner;

public class Solution2 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the number for factorial : ");
		int number = kb.nextInt();
		
		int result = factorial(1,number);	
		
		System.out.println("factorial of given number ("+number+"!) is "+result);
	}

	private static int factorial(int i, int number) 
	{
		if (i<=number)
		{
			return i*factorial(++i, number);
		}
		else
		{
			return 1;
		}
	}

	
}
