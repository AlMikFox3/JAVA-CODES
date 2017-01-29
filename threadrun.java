class threadeg implements Runnable
{
	public void run()
	{
		for(int i=1; i<=2;i++)
			System.out.println(i);
	}
}
class threadrun
{
	public static void main(String [] args)
	{
		threadeg t = new threadeg();
		Thread tr = new Thread(t);
		tr.start();
		for(int i=4; i<=5;i++)
			System.out.println(i);
	}
}