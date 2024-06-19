import java.util.Scanner;
class A 
{
	int a, b;
	A() 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter two numbers: ");
        	a = sc.nextInt();
        	b = sc.nextInt();
    	}
}

class B extends A 
{
	public static void main(String[] args) 
	{
        	B ob = new B();  // This calls the constructor of class A
        	ob.sum();
    	}
        void sum() 
	{
        	int sum = a + b;
        	System.out.println("Sum of " + a + " & " + b + " is: " + sum);
    	}
}

class HierarchicalInheritance extends A 
{
	public static void main(String[] args) 
	{
        	HierarchicalInheritance ob1 = new HierarchicalInheritance();
        	ob1.multiply();
    	}
        void multiply() 
	{
        	int mul = a * b;
        	System.out.println("Product of " + a + " & " + b + " is: " + mul);
    	}
}
