import java.io.*;
import java.util.*;
public class vowel{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the character");
		char ch = sc.next();
		
		if(ch == 'a' || ch=='A' || ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			System.out.println("IS VOWEL");
		else
			System.out.println("NOT VOWEL");
	}
}	