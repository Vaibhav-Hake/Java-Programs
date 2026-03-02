import java.util.Scanner;
class Pal{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int rev=0;
		for(int i=num;i!=0;i/=10){
			rev=rev*10+(i%10);
		}
		if(num==rev){
			System.out.println("Palidrome");
		}
		else{
			System.out.println("Not Palidrome");
		}
	}
}