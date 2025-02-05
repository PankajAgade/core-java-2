package array;

public class Try 
{
	public static void main(String[] args) 
	{
		int size = 5;
		
		int[] arr = new int[size];
		
		pairs(arr,arr.length-1);
	}

	private static void pairs(int[] arr, int i) 
	{ 
		for (int j = 0; j < arr.length; j++) 
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		
		if (isEnd(arr)) 
		{			
			if (arr[i]<arr.length-1)
			{
				arr[i]++;
				pairs(arr, arr.length-1);
			}
			else
			{
				arr[i]=0;
				pairs(arr, --i);
			}
		}
	}

	private static boolean isEnd(int[] arr) 
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==arr.length-1)
			{
				count++;
			}
		}
		
		if (count==arr.length) 
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
}
