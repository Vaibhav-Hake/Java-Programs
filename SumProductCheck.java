import java.util.Scanner;
class SumProductCheck{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int sum=0;
		int pro=1;
		while(num!=0){
			int rem=num%10;
			sum+=rem;
			pro*=rem;
			num/=10;
		}
		if(sum==pro){
			System.out.println("The sum And Product of Digit it Will be Same");
		}else{
			System.out.println("The Sum and Product of Didgit will Be not same:");
		}
	}
}