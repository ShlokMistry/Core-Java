import java.util.*;
class Fibo
{
	public static void main(String args[])
	{
		int x,a=1,b=1,fib=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number till you want to print the fibonacci series.");
		x=sc.nextInt();
		System.out.println("Fibonacci series = ");
		if(x==1)
		{
			System.out.println(a);
		}
		if(x==2)
		{
			System.out.println(a+" "+b);
		}
		if(x>=3)
		{
			System.out.print(a+" "+b+" ");
			for(int i=1;i<x-1;i++) 
			{
				fib=a+b;
				System.out.print(fib+" ");
				b=a;
				a=fib;
			}
		}
	}
}
		
		
		