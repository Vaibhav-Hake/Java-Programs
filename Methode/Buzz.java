import java.util.Scanner;
class Buzz{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		buzzNumber(num);
	}
	public static void buzzNumber(int num){
		if(num%7==0 || num%10==7){
			System.out.println("Buzz Number");
		}
		else{
			System.out.println(" not Buzz Number");
		}
	}
}