package test;

public class Solution10 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=1;
		}
		pairs(arr,n-1);
	}

	private static void pairs(int[] arr, int i)
	{
		if (isDifferent(arr))
		{
			if (place(arr))
			{
				for (int j = 0; j < arr.length; j++) 
				{
					System.out.print(arr[j]+" ");
				}
				System.out.println();
				
			}
		}
		if (notEnd(arr))
		{
			if(arr[i]<arr.length )
			{
				arr[i]++;
				if(i>=0)
				{
					pairs(arr,arr.length-1);
				}
			}
			else
			{
				arr[i]=1;
				pairs(arr,--i);
			}
		}
	}

	private static boolean place(int[] arr) 
	{
		boolean flag = true;
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if (arr[i]-arr[i+1]==1)
			{
				flag = false;
			}
			if (arr[i+1]-arr[i]==1)
			{
				flag = false;
			}
		}
		return flag;
	}

	private static boolean isDifferent(int[] arr) 
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
				{
					count++;
				}
			}
		}
		
		if (count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	private static boolean notEnd(int[] arr) 
	{
		boolean flag = false;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]!=arr.length)
			{
				flag = true;
			}
		}
		return flag;
	}
}
