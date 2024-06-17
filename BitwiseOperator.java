class BitwiseOperator 
{
	public static void main(String[] args) 
	{
        	int a = 5;  // 0101 in binary
        	int b = 3;  // 0011 in binary
        	int p = a & b;  
		int q = a | b;  
        	System.out.println("Bitwise AND of " + a + " and " + b + " is: " + p); 
		System.out.println("Bitwise OR of " + a + " and " + b + " is: " + q); 
	}
}