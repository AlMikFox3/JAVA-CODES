class large_prime
{
	public static void main(String [] args)
	{
		int l =(int) Math.pow(2,10);
		for( int i=2; i<=l; i++)
		{
			int f = 0;
			for(int j = 2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f =1;
					break;
				}
			}
			if(f == 0)
				System.out.println(i+" ");
		}
		
	}
}