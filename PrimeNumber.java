import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		int x,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check for prime or not: ");
		x=sc.nextInt();
		for(int i=2;i <= Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println(x+" is prime number");
		}
		else
		{
			System.out.println(x+" is not prime number");
		}
	}
}
		