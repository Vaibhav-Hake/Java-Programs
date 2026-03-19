import java.util.Scanner;
class Count {
	public static void Extract(int num){
		int cnt=0;
		while(num!=0){
			cnt++;
	     	num/=10;
		}
		System.out.println(" The Count of Given Number  A"+cnt);
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		Extract(num);
	}
}