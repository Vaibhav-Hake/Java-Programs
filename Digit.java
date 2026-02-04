import java.util.Scanner;
class Digit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Digit");
		char ch=sc.next().charAt(0);
		String op=(ch>='0'&&ch<='9')?(ch+" it is a Digit"):(ch+" it is a Not Digit");
		System.out.println(op);
	}
}