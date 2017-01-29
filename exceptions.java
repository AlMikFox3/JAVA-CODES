import java.io.*;
import java.util.*;
public class exceptions{
	public static void main(String [] args) throws IOException {
		
		try{
			try{
				int a = 5/0;
			}
			catch(ArithmeticException e)
			{
			System.out.println("Arithematic exception Caught !");
			}
			try{
				int a[] = new int[5];
				a[6] = 7;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			System.out.println("Array Index Out of Bound exception Caught !");
			}
			String s ="abc";
			int p = Integer.parseInt(s);
			
		}
		catch(Exception e)
			{
			System.out.println("Generic exception (In this case NumFormat Exception) Caught !");
			}
		
		
}	}