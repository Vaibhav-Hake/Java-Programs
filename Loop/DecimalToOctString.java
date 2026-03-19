import java.util.Scanner;
class DecimalToOctString{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		String bin="";
		while(num>0){
			bin=num%8+bin;
			num/=8;
		}
		System.out.println(bin);
	}
}