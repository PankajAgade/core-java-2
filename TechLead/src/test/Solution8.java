package test;

public class Solution8 
{
	public static void main(String[] args) 
	{
		String s = "AAAAAAABBBBCCCCCDDDDDDDDDDEEEEEEEEE";
		String s1 = "";

		int count=1;
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				s1=s1+s.charAt(i)+count;
				count=1;
			}
			
			if (i==s.length()-2)
			{
				i++;
				if (i==s.length()-1)
				{
					s1=s1+s.charAt(i)+count;
					count=1;
				}
			}
		}
		System.out.println(s1);
	}
}
