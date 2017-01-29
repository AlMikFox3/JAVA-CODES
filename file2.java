
import java.io.*;
import java.util.*;
class file2
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("C:\\Users\\b114036\\Desktop\\JAVA_5th_Sem");
		//f.createNewFile();
		String  s[] = f.list();
		System.out.println("No. of files and directories = "+ f.list().length);
		for( String s1 :s)
			System.out.println(s1);
		
	}
}