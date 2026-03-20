import java.util.Scanner;
class CheckFibbo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(fibbo(num)){
			System.out.println("The number is Fibbonaci number");
		}
		else{
			System.out.println("The number is not Fibbonacci number");
		}
	}
	public static boolean fibbo(int num){
		int n1=0,n2=1,ans;
		while(true){
			if(n1==num){
				return true;
			}
			else if(n1>=num){
				return false;
			}
			else{
				ans=n1+n2;
				n1=n2;
				n2=ans;
			}
		}
	}
}