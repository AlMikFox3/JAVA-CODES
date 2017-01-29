class MethodOverload
{
	public static void test(int i, double j)
	{
		System.out.println("IN METOD test(int,float)");
	}
	
	public static void test(double i, int j)
	{
		System.out.println("IN METOD test(float,int)");
	}
	public static void main(String [] args)
	{
		test(1,1.3);
		test(1.3,1);
	}
}