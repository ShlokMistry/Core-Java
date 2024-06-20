import java.util.*;
class D2Array
{
	public static void main(String args[])
  	{
    		int x,y;
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter range of Array: ");
   	 	x=sc.nextInt();
    		y=sc.nextInt();
    		int a[][]=new int[x][y];
    		System.out.println("enter the elements of array: ");
    		for(int i=0;i<a.length;i++)
    		{
      			for(int j=0;j<a.length;j++)
      			{
        			a[i][j]=sc.nextInt();
      			}
    		}
    		System.out.println("The 2DArray is: ");
    		for(int i=0;i<a.length;i++)
    		{
      			for(int j=0;j<a.length;j++)
      			{
        			System.out.print(a[i][j]+" ");
			}
      			System.out.println("");
		}
	}
}