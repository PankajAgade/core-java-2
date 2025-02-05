package test;

public class Solution7 
{
	public static void main(String[] args) 
	{
		int[] arr = {21,6,5,46,8,3,84,1,98,6};
		
		int element = findSecondLargest(arr);
		
		System.out.println("The 2nd largest element in an array is "+element);
	}

	private static int findSecondLargest(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if(max2<arr[i] && arr[i]!=max)
			{
				max2=arr[i];
			}
		}
		
		return max2;
	}
}
