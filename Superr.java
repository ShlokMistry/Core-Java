class A
{
	protected int a=10; 
}
class Superr extends A
{
	void meth()
	{
		int x=super.a;
		System.out.println("value of x is: "+x);
	}
	public static void main(String args[])
	{
		Superr ob=new Superr();
		ob.meth();
	}
}
		 
