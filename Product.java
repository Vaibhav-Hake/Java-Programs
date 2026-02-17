import java.util.Scanner;
class Product{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int pro=1;
		while(num!=0){
			int rem=num%10;
			pro*=rem;
			num/=10;
		}
		System.out.println("The Product Of Number Digit is: "+pro);
	}
}