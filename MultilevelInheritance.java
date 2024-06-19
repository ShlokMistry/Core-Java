import java.util.*;
class A
{
	int a;
	A()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		a=sc.nextInt();
	}
}
class B extends A
{
	int b;
	B()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter second number: ");
		b=sc.nextInt();
	}
}
class MultilevelInheritance extends B
{
	public static void main(String args[])
	{
		MultilevelInheritance ob=new MultilevelInheritance();
		int sum=0;
		sum=ob.a+ob.b;
		System.out.println("sum of " + ob.a + " & " + ob.b + " is: " + sum);
	}
}
	