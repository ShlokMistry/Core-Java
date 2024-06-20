import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int x,r,pal=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find if it is palindrome or not");
		x=sc.nextInt();
		int z=x;
		while(x!=0)
		{
			r=x%10;
			pal = pal*10+r;
			x=x/10;
		}
		if(pal==z)
		{
			System.out.println("the number "+z+" is palndrome");
		}
		else
		{		
			System.out.println("the number "+z+" is not palndrome");
		}			
	}
}