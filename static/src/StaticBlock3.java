class StaticBlock3{
	
	
	static{
		demo();
	}
	
	static int a=10;
	

	public static void main(String[]args){
		System.out.println("main");
		System.out.println(a);
		demo();
	}
	public static void demo(){
		System.out.println(a);
	}

}