class Overloading
{
	void Sum(int a,int b)
	{
		System.out.println("sum of "+a+" & "+b+" is: "+(a+b));
	}
	void Sum(int a,int b,int c)
	{
		System.out.println("sum of "+a+" & "+b+" & "+c+" is: "+(a+b+c));
	}
	public static void main(String args[])
	{
		Overloading ob=new Overloading();
		ob.Sum(1,2);
		ob.Sum(1,2,3);
	}
}
		
