package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDarray 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		System.out.print("Row : ");
		int row = kb.nextInt();
		
		System.out.print("Colummn : ");
		int col = kb.nextInt();
		
		for (int i = 0; i < row; i++) 
		{
			list.add(new ArrayList<Integer>());
			for (int j = 0; j < col; j++) 
			{
				System.out.print("[ "+i+" , "+j+" ] : ");
				list.get(i).add(j, kb.nextInt());
			}
		}
		System.out.println(list);
		
		System.out.println(list.size());
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				if (i-j==0 || i+j==(col-1)) 
				{
					System.out.print(list.get(i).get(j)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
