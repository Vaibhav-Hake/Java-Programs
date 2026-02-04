class Logical{
	public static void main(String[]args){
		System.out.println(true&&false);//false 
		System.out.println(5%2==1&&9%3==0);//true
		System.out.println('a'!='A' || false);//true
		System.out.println(!false);//true
		System.out.println(!true==false);//true
		System.out.println(!false&&!true);//false
		System.out.println(!false || !true);//true
		System.out.println('a'<'A'||'A'<'a');//true
	}
}