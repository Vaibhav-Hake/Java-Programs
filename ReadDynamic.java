import java.util.Scanner;
class ReadDynamic{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int a=sc.nextInt();
		System.out.println("Enter a Second Number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of "+a+" and "+b+"is:"+c);
	}
}