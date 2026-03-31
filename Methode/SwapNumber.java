class SwapNumber{
	public static void main(String[]args){
		int a=10;
		int b=5;
		/* using Bitwise Operator
		a=a^b;
		b=b^a;
		a=a^b;*/
		
		/* using addition and Substracting
		a=a+b;
		b=a-b;
		a=a-b;*/
		
		// using multiplication and division
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(" a ---> "+a);
		System.out.println(" b ---> "+b);
		
	}
}