package task1;

import java.util.Scanner;

public class CountingVally 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
        
        int n = 8;
        String path = "UDDDUDUU";
        
        int sum = 0;
        int count = 0;
        boolean flag = true;
        for(int i=0 ; i<n ;i++)
        {
            if(path.charAt(i)=='U')
            {
                sum++;
                if (sum==0)
                {
					//flag = true;
                	count++;
				}
            }
            else if(path.charAt(i)=='D')
            {
                sum--;
            }
//            if(sum>0)
//            {
//            	flag = false;
//            }
            
//            if(sum==0 && flag)
//            {
//            	flag = true;
//                count++;
//                System.out.println(i);
//            }
        }
        System.out.println("="+count);
            
	}
}
