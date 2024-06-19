import java.util.*;
class SimpleInheritance extends A
{
	public static void main(String args[])
	{
		int a,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		a=sc.nextInt();
		SimpleInheritance ob=new SimpleInheritance();
		sum=a+ob.b;
		System.out.println("sum of "+a+" & "+ob.b+" is: "+sum);
	}
}
class A
{
	int b=20;
	void A()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter second number: ");
		b=sc1.nextInt();
	}
	
}