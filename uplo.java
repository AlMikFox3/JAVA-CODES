import java.io.*;
import java.lang.*;
class uplo
{
    public static void main(String a[]) throws IOException
    {
        File f1= new File("Upper.txt");
        File f2=new File("Lower.txt");
        f1.createNewFile();
        f2.createNewFile();

        FileWriter fw=new FileWriter(f1);
        FileWriter fw2=new FileWriter(f2);
        for(int i=0;i<15;i++)
        {   BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
            char c=(char)obj.read();

            if(Character.isLowerCase(c))
            {
                fw2.write(c);
            }
            else if (Character.isUpperCase(c))
                {
                    fw.write(c);
                }
        }
        fw.flush();
        fw.close();
        fw2.flush();
        fw2.close();
    };
};
