class StaticBlock4{
	
	static int num=5;
	static int fact;
	
	static{
		fact=1;
		while(num>1){
			
			fact*= num;
			num--;
		}
		System.out.println(fact);
		System.out.println(num);
	}
	
	//static int a=10;
	

	public static void main(String[]args){
		System.out.println("main");
		System.out.println(num);
		System.out.println(fact);
		
	}
	

}