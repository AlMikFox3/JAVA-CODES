import java.io.*;
import java.util.*;
import java.lang.String;
class fibostr
{
    public static void main(String ar[])
    {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    System.out.println(n);
    String a="a";
    String b="b";
    System.out.print(a+" "+ b+" ");
    String temp1=a;
    String temp2=b;
    for(int i=0;i<n-2;i++)
    {
        System.out.print(temp1+temp2+" ");
        String temp3=temp1;
        temp1=temp2;
        temp2=temp3+temp2;
    }
    }
}
