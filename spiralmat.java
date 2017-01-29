import java.util.*;
class spiralmat{
	public static void main(String [] args)
	{
		System.out.println("Enter Dimensions:");
		
		Scanner ob = new Scanner(System.in);
		int m = ob.nextInt();
		int n = ob.nextInt();
		int mat[][] = new int[m][n];
		for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					mat[i][j] =ob.nextInt();
		int p = 0;
		int q = 0;
		while(p<m && q<n)
		{
			for(int i = q;i<n;i++)
			{
				System.out.print(mat[p][i]);
			}
			p++;
			for(int i =p;i<n;i++)
			{
				System.out.println(mat[i][n-1]);
			}
			n--;
			for(int i = n;i>q;i--)
			{
				System.out.println(mat[m-1][i-1]);
			}
			m--;
			for(int i = m; i>p; i--)
			{
				System.out.println(mat[i-1][q]);
			}
			q++;
		}
	}
}