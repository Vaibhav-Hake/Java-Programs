import java.util.Scanner;
class Hcf{
	public static int gcd(int n1,int n2){
		int small=n1<n2?n1:n2;
		while(true){
			if(n1%small==0&&n2%small==0){
				return small;
			}
			small--;
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num1");
		int n1=sc.nextInt();
		System.out.println("Enter a Num2");
		int n2=sc.nextInt();
		System.out.println(gcd(n1,n2));
	}
}