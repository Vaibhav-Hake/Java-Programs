import java.util.Scanner;
class DecimalToOct{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int bin=0;
		int pos=1;
		while(num>0){
			int rem=num%8;
			bin=bin+rem*pos;
			pos*=10;
			num/=8;
		}
		System.out.println(bin);
	}
}