class threadeg extends Thread
{
	public void run()
	{
		for(int i=1; i<=2;i++)
			System.out.println(i);
	}
}
class threadc
{
	public static void main(String [] args)
	{
		threadeg t = new threadeg();
		t.start();
		for(int i=4; i<=5;i++)
			System.out.println(i);
	}
}