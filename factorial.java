import java.io.*;
import java.util.*;
public class factorial{
	public static void main(String [] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for factorial");
		System.out.println("Enter 2 to for table ");
		int ch = sc.nextInt();
		System.out.println("Enter the number");
		
		
		int a = sc.nextInt();
		
		switch(ch)
		{
			case 1: {
					int f = 1;
					for(int i = 1;i<=a;i++)
					{
						f=f*i;
					}
					System.out.println("Factorial = " + f);
					break;	
					
				}
			case 2: {
					//int f = 0;
					for(int i = 1;i<=10;i++)
					{
						System.out.println(a + " X " +i + " = " + (a*i));
					}
					
					break;	
					
				}
			default : {

					System.out.println("WRONG CHOICE !!!!");			
				}
				
					
				
		}	
	}
}	