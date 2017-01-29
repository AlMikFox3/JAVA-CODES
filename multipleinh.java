interface base{
	public abstract void abc();
}
interface base2{
	public abstract void xyz();
	
}
class mainclass implements base, base2
{	
	public void abc(){
		System.out.println("Base Interface 1");
	}
	public void xyz(){
		System.out.println("Base Interface 2");
	}
}
class multipleinh
{
	public static void main(String [] args)
	{
		mainclass obj = new mainclass();
		obj.abc();
		obj.xyz();
	}
}