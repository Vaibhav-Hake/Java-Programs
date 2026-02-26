import java.util.Scanner;
class BinaryToDec{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Binary Number");
		int bin=sc.nextInt();
		int base=1, dec=0;
		while(bin>0){
			dec=dec+bin%10*base;
			base*=2;
			bin/=10;
		}
		System.out.println(dec);
	}
}