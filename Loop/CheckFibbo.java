import java.util.Scanner;
class CheckFibbo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int n1=0,n2=1,ans;
		while(true){
			ans=n1+n2;
			if(n1==num){
				System.out.println("The Number is Fibonacci Number!");
				break;
			}
			else if(n1>num){
				System.out.println("The Number is not Fibonacci Number!");
				break;
			}
			else{
				n1=n2;
				n2=ans;
			}
		}
	}
}