import java.io.*;
import java.util.*;
public class areap{
	public static void main(String [] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Circle");
		System.out.println("Enter 2 for Rectangle ");
		int ch = sc.nextInt();
		;
		
		switch(ch)
		{
			case 1: {
					System.out.println("Enter the radius of circle");
		
		
					int r = sc.nextInt();
					
					System.out.println("Area of circle = " + (3.14*r*r) +" sqr units\nPerimeter of Cirlcle = " + (6.28*r)+" units");
					break;	
					
				}
			case 2: {
					System.out.println("Enter the sides of rectangle");
		
		
					int a = sc.nextInt();
					int b = sc.nextInt();
					
					System.out.println("Area of Rectangle = " + (a*b) +" sqr units\nPerimeter of Cirlcle = " + (2*(a+b))+" units");
					break;	
					
				}
				
					
				
		}	
	}
}	