import java.io.*;
import java.util.*;
public class series{
	public static void main(String [] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		System.out.println("Enter the limit n");
		
		
		int n = sc.nextInt();
		
		switch(ch)
		{
			case 1: {
					int f = 0;
					for(int i = 1;i<=n;i++)
					{
						f = f+ i*i;
					}
					System.out.println("Series 1 = " + f);
					break;	
					
				}
			case 2: {
					int f = 3, k= 5,sum =0;
					for(int i = 1;i<=n; i++)
					{
						
						System.out.println(k+" "+f);
						
						sum = sum +f;
						f = f + k;
						k = k + 2;
						//System.out.println("!" + k+" "+f);
						//System.out.println(a + " X " +i + " = " + (a*i));
					}
					System.out.println("Series 2 = " + sum);
					
					break;	
					
				}
				case 3: {
					float f =0;
					for(float i = 1;i<=n;i++)
					{
						f = f + (float)(i/(i+1));
						//System.out.println(a + " X " +i + " = " + (a*i));
					}
					System.out.println("Series 3 = " + f);
					
					break;	
					
				}
			default : {

					System.out.println("WRONG CHOICE !!!!");			
				}
				
					
				
		}	
	}
}	