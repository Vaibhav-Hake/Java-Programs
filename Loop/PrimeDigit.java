import java.util.Scanner;
class PrimeDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while(num!=0){
			int rem=num%10;
			if(rem==2||rem==3||rem==5||rem==7){
				System.out.println(rem);
			}
			num/=10;
		}
	}
}