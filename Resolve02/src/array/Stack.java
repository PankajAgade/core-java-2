package array;

import java.util.Scanner;

public class Stack 
{
	
	static int top = 0;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the stack of size : ");
		int size = kb.nextInt();
		int[] arr = new int[size];
		
		boolean flag = true;
		while (flag)
		{
			System.out.println();
			
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Enter the option : ");
			int key = kb.nextInt();
			
			switch (key) 
			{
			case 1:
				arr = push(arr);
				display(arr);
				break;
				
			case 2:
				arr = pop(arr);
				display(arr);
				break;
				
			case 3:
				System.out.println("Application Ended.");
				flag = false;
				break;
				
			
			default:
				System.out.println("Invalid Option");
				break;
			}
			
		}
	}
	
	private static int[] pop(int[] arr) 
	{
		if (top==0)
		{
			System.out.println("Stack is underload.");
		}
		else
		{
			top--;
			System.out.println("pop element is "+arr[top]);
			arr[top]=0;
		}
		return arr;
	}

	private static int[] push(int[] arr) 
	{
		if (top==arr.length)
		{
			System.out.println("Stack is overflow.");
		}
		else
		{
			System.out.print("Enter the vlaue of push : ");
			int value = kb.nextInt();
			arr[top++]=value;
		}
		return arr;
	}

	static void display(int[] arr)
	{
		System.out.println();
		System.out.print("Stack => ");
		for(int p: arr)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
}
