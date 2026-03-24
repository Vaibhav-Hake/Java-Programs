import java.util.Scanner;
class Buzz{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(buzzNumber(num)){
			System.out.println("it is a Buzz Number");
		}else{
			System.out.println("Not buzz Number");
		}
	}
	public static boolean buzzNumber(int num){
		return (num%7==0 || num%10==7);
	}
}