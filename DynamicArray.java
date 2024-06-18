import java.util.*;
class DynamicArray
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		x=sc.nextInt();
		int a[]=new int[x];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("    index = Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+i+" = "+a[i]);
		}
	}
}