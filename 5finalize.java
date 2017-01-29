//finalise, finally, final
class pro1
{
public void finalize()
{
System.out.println("finalise is executed");
}

static int a;
final static int b=10;


public static void xyz()
{
System.out.println("final variable "+b);
try
{
a=5/2;
}

catch(ArithmeticException e)
{
System.out.println("exception handled");
}

finally
{
System.out.println("finally executed");
}
}
public static void main(String [] args)
{
pro1 obj = new pro1();
pro1 obj1=new pro1();
obj = null;
obj1= null;

xyz();
System.gc();
}
}