class StaticBlock1{
	static{
		System.out.println("Static Block1");
	}
	public static void main(String[]args){
		System.out.println("Main");
	}
	static{
		System.out.println("Static Block2");
	}
	static{
		System.out.println("Static Block3");
	}
}