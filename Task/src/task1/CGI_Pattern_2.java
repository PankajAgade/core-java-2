package task1;

/*

1 2 4
3 5 7
6 8 9

 */

public class CGI_Pattern_2 {

	public static void main(String[] args) {
		int n = 3;
		int a = 1;
		int num = 2;

		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n; j++) 
			{
				
					System.out.print(((a*n)-n)+" ");   //((a*n)-a)-((n*i)-1)
					a++;
				
			}
			System.out.println();
		}
	}
}
