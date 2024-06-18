import java.util.*;
class Finall
{
	final float pie = 22.0f/7;
	float Area(float pie,float r)
	{
		float area = pie*r*r;
		return area;
	}
	public static void main(String args[])
	{
		
		float r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle: ");
		r=sc.nextInt();
		Finall ob=new Finall();
		System.out.println("area of circle is: "+ob.Area(ob.pie,r));
	}
}
		