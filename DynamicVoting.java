import java.util.*;
class DynamicVoting
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are under age you can't vote");
		}
		else
		{
			System.out.println("Congratulations , You can vote");
		}
	}
}
	