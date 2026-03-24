import java.util.Scanner;
class Lcm{
	public static int lcm(int n1,int n2){
		int large=n1>n2?n1:n2;
		int i=1;
		while(true){
			if(large*i%n1==0&&large*i%n2==0){
				return large*i;
			}
			i++;
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num1");
		int n1=sc.nextInt();
		System.out.println("Enter a Num2");
		int n2=sc.nextInt();
		System.out.println(lcm(n1,n2));
	}
}