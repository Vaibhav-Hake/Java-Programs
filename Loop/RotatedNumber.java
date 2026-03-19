import java.util.Scanner;
class RotatedNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		
		int rem=num%10;
		num/=10;
		int d=1;
		for(int i=num;i!=0;i/=10){
			d*=10;
		}
		int rot=rem*d+num;
		System.out.println(rot);
	}
}