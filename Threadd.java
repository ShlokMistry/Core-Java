import java.util.*;
class Threadd
{
	public static void main(String args[])
	{
		
			A ob=new A();
			ob.start();
			
	}
}
class A extends Thread
{
	public void run()
	{
		String x=Thread.currentThread().getName();
		System.out.println("hello thread"+x);
	}
}
	