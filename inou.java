import java.io.*;
class outer
{
    int a;
    static class inner
    {
        public static void inner_method()
        {
            System.out.println("Inner Method");
        }
    }
};
class inou
{
    public static void main(String a[])
    {
        outer.inner obj= new outer.inner();
        obj.inner_method();
    };
};
