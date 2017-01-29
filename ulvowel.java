import java.io.*;
import java.util.*;
public class ulvowel{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int u=0, l=0 ,v=0;
		char ch;
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				u++;
			if(Character.isLowerCase(ch))
				l++;
			if(ch == 'a' || ch=='A' || ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				v++;
		}
		System.out.println("vowels = " + v + "\nUC = " + u + "\nLC = "+ l);
}
}