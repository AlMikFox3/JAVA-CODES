import java.util.*;
class matmul{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER m,n and " + " values for mat1");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat1[][] = new int[m][n];
		for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					mat1[i][j] =sc.nextInt();
		System.out.println("ENTER p,q and " + " values for mat1");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int mat2[][] = new int[p][q];
		for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					mat2[i][j] =sc.nextInt();
		if(p==n)
		{
			int res[][] =new int[m][q];
			for(int i=0;i<m;i++)
				for(int j=0;j<q;j++)
					res[i][j] = 0;
					
			for(int i = 0;i<m;i++)
			{
				for(int j= 0; j<q; j++)
				{
					for(int k = 0; k<p;k++)
					{
						res[i][j] = res[i][j] + mat1[i][k]*mat2[k][j];
					}
				}
			}
			for(int i=0;i<m;i++)
				{for(int j=0;j<q;j++)
					{System.out.print(res[i][j] + " ");}
						System.out.println();
			}
		}
		else System.out.println("Mat1 and Mat2 aint Multiplication Compatible.");
	}
}