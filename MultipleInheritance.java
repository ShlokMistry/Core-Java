import java.util.*;
interface A
{
	int Avalue();
	void getA();
	
}
interface B
{
	int Bvalue();
	void getB();
}
class MultipleInheritance implements A,B
{
	private int a;
	private int b;
	public void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		a=sc.nextInt();
	}
	public void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter second number: ");
		b=sc.nextInt();
	}
	public int Avalue()
	{
		return a;
	}
	public int Bvalue()
	{
		return b;
	}
	public static void main(String args[])
	{
		MultipleInheritance ob=new MultipleInheritance();
		ob.getA();
		ob.getB();
		int sum=ob.Avalue()+ob.Bvalue();
		System.out.println("sum of "+ob.Avalue()+" & "+ob.Bvalue()+" is: "+sum);
	}
}	
