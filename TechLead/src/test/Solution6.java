package test;

import java.util.TreeSet;

public class Solution6 {
	public static void main(String[] args) 
	{
		String s = "aakjkk";
		int count = 0;

		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i + 1; j <= s.length(); j++) 
			{
				StringBuffer str = new StringBuffer(s.substring(i, j));
				
				StringBuffer rev = new StringBuffer(str);
				rev.reverse();
				
				if (str.compareTo(rev) == 0) 
				{
					ts.add(str.length());
				}
			}
		}
		System.out.println(ts.size());

	}

}
