import java.util.Scanner;
class Alphabet{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		String op=(ch>='a'&&ch<='z')||(ch>='a'&&ch<='z')?(ch+" it is alphabet"):(ch+" it is not Alphabet");
	    System.out.println(op);
	}
}