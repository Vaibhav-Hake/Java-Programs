class SwapNumber{
	public static void main(String[]args){
		int a=10;
		int b=5;
		/*a=a^b;
		b=b^a;
		a=a^b;*/
		
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(" a ---> "+a);
		System.out.println(" b ---> "+b);
		
	}
}