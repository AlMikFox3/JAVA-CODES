import java.io.*;
public class file3 {

   public static void main(String args[])throws IOException {
      File file = new File("abc.txt");
	   File fil = new File("def.txt");
      fil.createNewFile();
      // creates the file
      if(!file.exists())
		System.out.println("Source does not exist");
	  else{
      
			FileReader fr = new FileReader(file); 
			char [] a = new char[200];
			fr.read(a);
	 
		FileWriter Writer = new FileWriter(fil); 
      
     
      Writer.write(a); 
      Writer.flush();
      Writer.close();

     
	  }
   }
}