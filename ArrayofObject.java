
class ArrayofObject
{
		String name;
		int roll;
		int sem;
	public static void main(String args[])
	{
		ArrayofObject ob=new ArrayofObject();
		ob.name="a";
		ob.roll=100;
		ob.sem=1;
		ArrayofObject ob1=new ArrayofObject();
		ob1.name="b";
		ob1.roll=101;
		ob1.sem=2;
		ArrayofObject ob2=new ArrayofObject();
		ob2.name="c";
		ob2.roll=102;
		ob2.sem=3;
		ArrayofObject A[]=new ArrayofObject[3];
		A[0]=ob;
		A[1]=ob1;
		A[2]=ob2;
		for(int i=0;i<3;i++)
		{
			System.out.println(A[i].name);
			System.out.println(A[i].roll);
			System.out.println(A[i].sem);
		}
	}
}
					


		
		