class ftf
{
    public void finalize()
    {
        System.out.println("Finalize is being Executed");

    }
    public static void main(String[] args)
    {

        int a=10;

        try {
                System.out.println("In try block");
                a=5/0;
            }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Catched");
        }
        finally
        {
        System.out.println("In Finally Block");
        }

        System.gc();
        ftf cal = new ftf();
        cal.finalize();

          if(a>0)
        {
            throw new ArithmeticException("Exception Thrown by throw keyword");
        }



    }

}
