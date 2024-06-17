class UnaryOperator
{
	public static void main(String args[])
	{	
		Boolean x = false;
		int i = 10;
		int a = i++;
		int b = ++i;
		int c = i--;
		int d = --i;
		System.out.println("x is: "+ x);
		System.out.println("invert of x is: "+ !x);
	}
}