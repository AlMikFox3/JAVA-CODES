import java.util.*;
class wordpal{
	public static boolean checkpal(String a)
	{
		String b = "";
		for(int i =a.length()-1 ;i >=0;i--)
		{
			b = b + a.charAt(i);
		}
		if(a.equals(b)){//System.out.println("Yeah");
			return true;}
		else return false;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String [] str = a.split(" ");
		int count = 0;
		for(int i= 0;i<str.length;i++)
		{
			if(checkpal(str[i]))
				count++;
		}
		System.out.println(count);
	
	}
}