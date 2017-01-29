class threadeg extends Thread
{
	public void run()
	{
		System.out.println("New thread before sleep");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("thread after sleep");
	}
}
class sleepjoin
{
	public static void main(String [] args)
	{
		threadeg t1 = new threadeg();
		threadeg t2 = new threadeg();
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.start();
		System.out.println("Main thread ends here....");
	}
}