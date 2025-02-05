package task1;

public class Parking 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{5,10},{0,20},{20,40},{35,45}};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if (min>arr[i][j])
				{
					min=arr[i][j];
				}
				if (max<arr[i][j])
				{
					max=arr[i][j];
				}
			}
		}
		
		int minSlot = Integer.MIN_VALUE;
		for (int i = min; i <= max; i++) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++) 
			{
				if (i>=arr[j][0] && i<=arr[j][1])
				{
					count++;
				}
			}
			
			if (minSlot<count)
			{
				minSlot=count;
			}
		}
		
		System.out.println("Slot => "+minSlot);
	}
}
