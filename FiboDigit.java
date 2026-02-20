import java.util.Scanner;
class FiboDigit{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		while(num!=0){
			int rem=num%10;
			if(rem==0||rem==1||rem==2||rem==3||rem==5||rem==8){
				System.out.println(rem);
			}
			num/=10;
		}
	}
}