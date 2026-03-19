import java.util.Scanner;
class SpyNumber{
	public static int sum(int num){
		int sum=0;
		while(num!=0){
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
		
	}
	public static int pro(int num){
		int pro=1;
		while(num!=0){
			int rem=num%10;
			pro*=rem;
			num/=10;
		}
		return pro;
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		if(sum(num)==pro(num)){
			System.out.println("Spy Number");
		}
		else{
			System.out.println("Not Spy Number");
		}
		
	}
}