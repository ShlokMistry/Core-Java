import java.util.*;
class TypesOfConstructors
{
	TypesOfConstructors()
	{
		System.out.println("default Constructor called.");
	}
	TypesOfConstructors(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum of two numbers is: "+sum+"\nParameterized constructor called");
	}
	TypesOfConstructors(TypesOfConstructors ob)
	{
		System.out.println("Copy Constructor called");
	}
	public static void main(String args[])
	{
		TypesOfConstructors ob=new TypesOfConstructors();
		TypesOfConstructors ob1=new TypesOfConstructors(10,20);
		TypesOfConstructors ob2=new TypesOfConstructors(ob);
	}
}
		
	