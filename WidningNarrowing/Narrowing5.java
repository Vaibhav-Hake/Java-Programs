class Narrowing5{
	public static void main(String[]args){
		char a='?';
		short b=(short)a;
		byte c=(byte)a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}