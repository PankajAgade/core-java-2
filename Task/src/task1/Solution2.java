package task1;

public class Solution2 
{
	public static void main(String[] args) 
	{
		String s = "I am a very good engineer";
		
		char[] arr = s.toCharArray();
		char[] arr1 = {'v','e','r','y'};
		
		boolean save = true;
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 0;
			int index = 0;
			if(arr[i]==arr1[index] && save==true)
			{
				boolean flag = true;
				for (int j = i; j < arr.length; j++) 
				{
					if (index<arr1.length)
					{
						if(arr[j]==arr1[index++] && flag==true)
						{
							count++;
						}
						else
						{
							flag = false;
						}
					}
					
				}
				//System.out.println(count);
				if (count==arr1.length) 
				{
					//System.out.println("count = "+count);
					//System.out.println(" i = "+i);
					save = false;
					i=i+arr1.length+1;
				}
			}
			System.out.print(arr[i]);
		}
		
	}
}