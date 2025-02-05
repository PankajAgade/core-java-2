package test;

import java.util.Scanner;

//Write a program to sort an array.

public class Solution5 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = kb.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print("Enter the element of arr["+i+"] : ");
			arr[i]=kb.nextInt();
		}
		
		//int[] arr = {5,6,4,0,3,6,1,0,9,2,4,0,4,5};
		
		for (int i = 0; i < arr.length; i++)
		{
			int index = i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[j]<arr[index])
				{
					index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		
		for(int p:arr)
		{
			System.out.print(p+" ");
		}
		
	}
}
