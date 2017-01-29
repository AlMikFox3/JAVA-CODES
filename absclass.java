abstract class test{
	public abstract void abc();
	public void xyz(){
		System.out.println("In Base Class Non Abstract Method.");
	}
}
class child extends test
{
	public void abc(){
		System.out.println("In the base class abstract method.");
	}
}
class absclass{
	public static void main (String [] args)
	{
		child c = new child();
		c.abc();
		c.xyz();
	}
}