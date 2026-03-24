import java.util.Scanner;
class Factorial{
	public static int factorial(int num){
		int fact=1;
		while(num>1){
			fact*=num;
			num--;
		}
		return fact;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(factorial(num));
	}
}