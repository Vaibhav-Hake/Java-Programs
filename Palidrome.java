import java.util.Scanner;
class Palidrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0){
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(num==rev){
			System.out.println("The "+ num+" is a Palidrome");
		}
		else{
			System.out.println("The "+ num+" is not Palidrome");
		}
	}
}