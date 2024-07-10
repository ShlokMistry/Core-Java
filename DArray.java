import java.util.*;
class DArray
{
	public static void main(String args[])
	{
		int x,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of arrsy: \n");
		x=sc.nextInt();
		int A[]=new int[x];
		System.out.println("\nenter elements: ");
		for(i=0;i<x;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("\narray is: ");
		for(i=0;i<x;i++)
		{
			System.out.println(A[i]);
		}
	}
}