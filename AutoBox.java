class AutoBox
{
	public static void main(String args[])
	{
		int a=10;
		Integer i=Integer.valueOf(a);
		System.out.println("a= "+a);
		System.out.println("after converting primitive datatypes into objects: "+i);
	}
}