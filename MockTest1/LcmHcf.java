import java.util.Scanner;
class LcmHcf{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number1");
		int n1=sc.nextInt();
		System.out.println("Enter a Number2");
		int n2=sc.nextInt();
		int small=n1<n2?n1:n2;
		while(small!=1){
			if(n1%small==0&&n2%small==0){
				break;
			}
			small--;
		}
		System.out.println("The hcf is "+small);
		int lcm=(n1*n2)/small;
		System.out.println("The Lcm Is "+lcm);
	}
}