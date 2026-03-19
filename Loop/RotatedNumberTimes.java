import java.util.Scanner;
class RotatedNumberTimes{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		System.out.println("Enter a How Many Times Rotates");
		int n=sc.nextInt();
		int d=1;
		for(int i=num/10;i!=0;i/=10){
			d*=10;
		}
		
		for(int j=0;j<n;j++){
			int rem=num%10;
		int rot=rem*d+(num/=10);
		System.out.println(rot);
		num=rot;
		}
	}
}