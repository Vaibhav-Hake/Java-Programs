class Experiment{
	static int a;
	public static void main(String[]args){
		a=10;
		System.out.println(a);
		demo();
	}
	public static void demo(){
		a=5;
		System.out.println(a);
		demo2();
	}
	public static void demo2(){
		System.out.println(a);
	}
}