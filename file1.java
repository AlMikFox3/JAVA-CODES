import java.io.*;
import java.util.*;
class file1
{
	public static void main(String [] args) throws IOException
	{
		File f = new File("abc.txt");
		f.createNewFile();
		if(f.exists())
		{
			if(f.isFile())
				System.out.println("abc.txt exists and is a file.");
		}
		else
			System.out.println("File does not exist");
		System.out.println("No. of files and directories = "+ f.list());
		//f.delete();
		if(!f.exists())
			System.out.println("abc.txt deleted");
	}
}