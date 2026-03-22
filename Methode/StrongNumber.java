import java.util.Scanner;
class StrongNumber{
	public static int factorial(int num){
		int fact=1;
		while(num>1){
			fact*=num;
			num--;
		}
		return fact;
	}
	public static int sum(int num){
		int sum=0;
		while(num!=0){
			sum+=factorial(num%10);
			num/=10;
		}
		return sum;
	}
	public static boolean isStrong(int num){
		return num==sum(num);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		if(isStrong(num)){
			System.out.println("The number is Strong");
		}
		else{
			System.out.println("The number is not Strong");
		}
	}
}