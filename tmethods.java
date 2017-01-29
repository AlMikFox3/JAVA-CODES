class threadeg extends Thread
{
	public void run()
	{
		System.out.println("New thread");
		System.out.println("Current thread name = " + Thread.currentThread().getName() + " Current thread ID = " + Thread.currentThread().getId());
	}
}
class tmethods
{
	public static void main(String [] args)
	{
		threadeg t1 = new threadeg();
		threadeg t2 = new threadeg();
		t1.setName("ThreadOne");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		System.out.println("Current thread = " + Thread.currentThread().getName());
		
		System.out.println("Main thread ends here....");
	}
}