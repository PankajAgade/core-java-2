package test;

import java.util.ArrayList;
import java.util.List;

public class Solution9 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("AREA");
		list.add("BALL");
		list.add("DEAR");
		list.add("LADY");
		list.add("LEAD");
		list.add("YARD");
			
		
		for (int k = 0; k < list.size(); k++) // get one string
		{
			String s = list.get(k);
			List<String> list2 = new ArrayList<String>();
			
			list2.add(list.get(k));
			for (int i = 1; i < s.length(); i++) 
			{
				for (int j = 0; j < list.size(); j++) 
				{
					
					if ( s.charAt(i)==list.get(j).charAt(0)  && list.get(j).compareTo(s)!=0)
					{
						boolean flag = true;
						for (int j2 = 0; j2 < list2.size(); j2++) 
						{
							if (list.get(j).compareTo(list2.get(j2))==0) 
							{
								flag = false;
							}
						}
						
						if (flag)
						{
							list2.add(list.get(j));
						}
					}
				}
			}	
			
			if((list2.get(0).length())==(list2.size()))
			{
				char[][] arr = new char[list2.size()][list2.size()];
				for (int i = 0; i < list2.size(); i++) 
				{
					arr[i][0] = list2.get(i).charAt(0);
					arr[i][1] = list2.get(i).charAt(1);
					arr[i][2] = list2.get(i).charAt(2);
					arr[i][3] = list2.get(i).charAt(3);
				}
				
				for (int i = 0; i < arr.length; i++)
				{
					for (int j = 0; j < arr[i].length; j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println();
				
				boolean flag = true;
				for (int i = 0; i < arr.length; i++)
				{
					for (int j = 0; j < arr[i].length; j++)
					{
						if(arr[i][j]!=arr[j][i])
						{
							flag = false;
							System.out.println(i+" "+j);
						}
					}
					System.out.println();
				}
			}
		}
		
		
		
		
	}
}
