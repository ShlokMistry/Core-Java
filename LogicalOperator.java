class LogicalOperator // &&,||
{
	public static void main(String args[])
	{
		int x = 2024;
		System.out.println("Find that the number is leap year or not");
		if(x%4==0 && x%100!=0 || x%400==0)
		{
			System.out.println(x+" is leap year");
		}
		else
		{
			System.out.println(x+" is not leap year");
		}	
		
	}
}

		