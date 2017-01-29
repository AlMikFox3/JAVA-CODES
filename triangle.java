import java.io.*;
import java.util.*;
public class triangle{
	public static void main(String [] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sides of triangle");
		Scanner sc = new Scanner(System.in);
		int ch,f=1;
		//int ch = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Enter 1 for validity of triangle");
		System.out.println("Enter 2 to check isosceles condition ");
		System.out.println("Enter 3 for rt angled triangle");
		
		ch = sc.nextInt();
		switch(ch)
		{
			case 1: {
					if((a+b)>c && (b+c)>a && (c+a) > b)
						System.out.println("Possible");
					else
						System.out.println("Not Possible");
					break;		
					
				}
			case 2: {
					if(!((a+b)>c && (b+c)>a && (c+a) > b)){
						System.out.println("Triangle Not Possible");
						break;}
					if((a==b) || (b==c) || (c==a))
						System.out.println("IS ISOSCELES");
					else
						System.out.println("NOT ISOSCELES");
					break;		
					
				}
			case 3: {
					if(!((a+b)>c && (b+c)>a && (c+a) > b)){
						System.out.println("Triangle Not Possible");
						break;}
					if((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b))
						System.out.println("IS RIGHT ANGLED");
					else
						System.out.println("NOT RIGHT ANGLED");
					break;		
					
				}
			default : {

					System.out.println("WRONG CHOICE !!!!");
					f = 0;
				}
		}
			
	}
}	