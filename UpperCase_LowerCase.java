import java.util.Scanner;
class UpperCase_LowerCase{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Chracter:");
		char ch=sc.next().charAt(0);
		String op=(ch>='a'&&ch<='z')?(ch+ " is a LowerCase"):(ch>='A'&&ch<='Z')?(ch+ " is a UpperCase"):("It is a not character");
	   System.out.println(op);	
	}
}