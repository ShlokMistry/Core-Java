import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int x,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number whose factorial you want: ");
		x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			fact *= i;
		}
		System.out.println("Factorial of "+x+" is: "+fact);
	}
}