import java.util.*;
class D2Array
{
	public static void main(String args[])
	{
		int x,y,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of 2D array(x & y)");
		x=sc.nextInt();
		y=sc.nextInt();
		int A[][] =new int[x][y];
		System.out.println("\nenter elements: ");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is: ");
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(A[i][j]+" ");
			}System.out.println("");
		}
	}
}
