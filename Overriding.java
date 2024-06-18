import java.util.*;
class Overriding extends A
{
	void Sum(int a,int b)
	{
		System.out.println("sum of two number entered is: "+(a+b));
	}
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		Overriding ob=new Overriding();
		ob.Sum(a,b);
		A ob1=new A();
		ob1.Sum(a,b);
	
	}
}
class A
{
	void Sum(int a,int b)
	{
		System.out.println("Class A method called");
		System.out.println("sum of two number entered is: "+(a+b));
	}
}