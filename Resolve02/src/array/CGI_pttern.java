package array;

public class CGI_pttern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int mul = n*(n+1)+1;
		//System.out.println(mul);
		int s = 1;
		int es = 1;
		for (int i = 1; i <= n; i++) 
		{
			
			for (int j = 1; j <= n*2; j++) 
			{
				if (i+j<(n*2)+2 && i-j<=0)  //j<=n   
				{
					if (j<=n)
					{
						System.out.print(s++);
						es = mul-s+1;
					}
					else
					{
						System.out.print(es++);
					}
					
					if (j>0 && (i+j)<(n*2)+1)  //j<(n*2)
					{
						System.out.print("*");
					}
				}
				else
				{
					if (j<n)
					{
						System.out.print("--");
					}
				}
			}
			System.out.println();
		}
		
		
	}
}
