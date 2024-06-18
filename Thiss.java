import java.util.*;
class Thiss
{
	int a;
	void getset()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		this.a=sc.nextInt();
	}
	public static void main(String args[])
	{
		
		Thiss ob=new Thiss();
		ob.getset();
		int a=ob.a;
		System.out.println("local variable a= "+a);	
		System.out.println("Instance variable a= "+ob.a);
	}
}
		