import java.util.Scanner;
class ProOfDigit{
	public static void product(int num){
		int pro=1;
		while(num!=0){
			int rem=num%10;
			pro*=rem;
			num/=10;
		}
		System.out.println(pro);
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		product(num);
	}
}