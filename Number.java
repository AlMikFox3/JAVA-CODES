import java.util.*;
class Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Prime\n2.Palindrome\n3.Perfect\n4.Armstrong");
		int c = sc.nextInt();
		//int n = sc.nextInt();
		
		switch(c){
			case 1:{
							int f = 0;
							int n = sc.nextInt();
							for(int i = 2;i<=n/2;i++)
							{
								if(n%i==0)
								{
									f =1;
									break;
								}
							}
							if(f==1)
								System.out.println("NOT PRIME");
							else
								System.out.println("PRIME");
							break;
				}	
			case 2:{
							int n = sc.nextInt();
							int t=n;
							int rem;
							int rev = 0;
							while(t>0)
							{
								rem = t%10;
								rev = rev*10 + rem;
								t = t/10;
							}
							if(rev == n)
								System.out.println("PALINDROME");
							else
								System.out.println("NOT PALINDROME");
							break;
			}
			case 3:{
							//int f = 0;
							int n = sc.nextInt();
							int sum = 0;
							for(int i = 1;i<=n/2;i++)
							{
								if(n%i==0)
								{
									sum =sum + i;
								}
							}
							if(n==sum)
								System.out.println("PERFECT");
							else
								System.out.println("NOT PERFECT");
							break;
				}
			case 4:{
							int n = sc.nextInt();
							int t=n;
							int rem;
							int sum = 0;
							while(t>0)
							{
								rem = t%10;
								sum = sum + (rem*rem*rem);
								t = t/10;
							}
							if(sum == n)
								System.out.println("ARMSTRONG");
							else
								System.out.println("NOT ARMSTRONG");
							break;
			}
			default :{
						System.out.println("WRONG CHOICE");
			}
		}
	}
}