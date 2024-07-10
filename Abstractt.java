abstract class A
{
	abstract void demo();
}
class Abstractt extends A
{
	void demo()
	{
		System.out.println("abstract method success");
	}
	public static void main(String args[])
	{
		Abstractt ob=new Abstractt();
		ob.demo();
	}
}
 