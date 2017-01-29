class oper
{
	public static void main(String[] args)
	{
		int a=5, b=6;
		Boolean t= true;

		Boolean f = false;
		System.out.println("a="+a+"  b="+b+'\n');
		
		System.out.println("SUM="+(a+b)+'\n');

		System.out.println("DIFF="+(a-b)+'\n');		
		
		System.out.println("MUL="+(a*b)+'\n');

		System.out.println("DIV="+(a/b)+'\n');

		System.out.println("MODULO="+(a%b)+'\n');
		System.out.println("a>b="+(a>b)+'\n');
		System.out.println("a<b="+(a<b)+'\n');
		System.out.println("(a&b)="+(a&b)+'\n');
		System.out.println("(a|b)="+(a|b)+'\n');
		System.out.println("(a==b)="+(a==b)+'\n');
		System.out.println("a>>b="+(a>>b)+'\n');
		System.out.println("a<<b="+(a<<b)+'\n');
		System.out.println("a>>2="+(a>>2)+'\n');
		System.out.println("a<<2="+(a<<2)+'\n');
		//System.out.println("(0 && 1)="+(boolean(0) && boolean(1))+'\n');		
		System.out.println("(0 && 1)="+(f&&t)+'\n');
		System.out.println("(0 && 0)="+(f&&f)+'\n');
		System.out.println("(1 && 1)="+(t&&t)+'\n');
		System.out.println("(0 || 1)="+(f||t)+'\n');
		System.out.println("(0 || 0)="+(f||f)+'\n');
		System.out.println("(1 || 1)="+(t||t)+'\n');
		
		System.out.println("5 XOR 3 = "+(5^3)+'\n'); 
		System.out.println("~5="+(~5)+'\n');
		System.out.println("~6="+(~6)+'\n');
		System.out.println("~7="+(~7)+'\n');
		System.out.println("~8="+(~8)+'\n');
		System.out.println("~(-8)="+(~(-8))+'\n');
	}
}