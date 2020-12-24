package task1;

public class ContinuousSequence 
{
	public static void main(String[] args) 
	{
		int[] arr = {9,3,7,1,2,3,4,5,3,6,9,7,8,5}; //5
		
		int count =0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length-1; i++) 
		{
			
			if (arr[i+1]==arr[i]+1)
			{
				count++;
			}
			else
			{
				count =0;
			}
			if (max<count)
			{
				max=count;
			}
		}
		
		System.out.println("length of the longest sub array => "+(max+1));
		
	}
}
