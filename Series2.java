import java.util.*;
class Series2
{
	public static int fact(int n){
		int f =1;
		while(n>0)
		{
			f = f*n;
			n--;
		}
		return f;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum1 = 0, sum2 = 2;
		for(int i = 1;i<=n ;i++)
		{
			sum1 = sum1 + fact(i);
		}
		int first = 0; int second =1;
		for(int i= 0; i<n-2 ; i++)
		{
			int t = first + second;
			first = second;
			second = t;
			//System.out.println(second);
			sum2 = sum2 + fact(second);
		}
		
		System.out.println("Sum1 = "+sum1);System.out.println("Sum2 = "+sum2);
	}
}