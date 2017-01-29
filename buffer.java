import java.io.*;
import java.lang.StringBuffer;
class buffer
{
   public static void main(String [] args)
    {

        StringBuffer str=new StringBuffer("Hello");

        System.out.println(str);
        System.out.println(str.append("Java"));
        System.out.println(str.reverse());
        str.reverse();
        System.out.println(str.insert(5," Hi "));
        System.out.println(str.replace(6,8,"Hello"));
        System.out.println(str.delete(5,11));
    }
};

