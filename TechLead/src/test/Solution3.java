package test;

import java.util.Scanner;

public class Solution3 
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
		
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		
		int[] arr2 = new int[(arr.length-count)*2];
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			boolean flag = false;
			for (int j = 0; j < arr2.length; j++) 
			{
				if(arr[i]==arr2[j])
				{
					flag=true;
					break;
				}
			}
			if (!flag) 
			{
				arr2[index++]=arr[i];
			}
		}
		
		int uniqe = (arr.length-count);
		index = uniqe;
		//System.out.println("index = "+index);
		for (int i = 0; i < arr2.length/2; i++) 
		{
			count = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr2[i]==arr[j])
				{
					count++;
				}
			}
			arr2[index++]=count;
//			System.out.println("==="+count);
		}
		
		index = uniqe;
		for (int i = 0; i < arr2.length/2; i++)
		{
			System.out.println("Element = "+arr2[i]+" === frequency = "+arr2[index++]);
		}
	}
}
