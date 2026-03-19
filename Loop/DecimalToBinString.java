import java.util.Scanner;
class DecimalToBinString{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		String bin="";
		while(num>0){
			bin=num%2+bin;
			num/=2;
		}
		System.out.println(bin);
	}
}