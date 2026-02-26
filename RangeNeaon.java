import java.util.Scanner;
class RangeNeaon{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat no:");
		int start=sc.nextInt();
		System.out.println("Enter a End no:");
		int end=sc.nextInt();
		while(start<=end){
			int sq=start*start;
			int sum=0;
			for(int i=sq;i!=0;i/=10){
				sum+=i%10;
			}
			if(sum==start){
				System.out.println(start);
			}
			start++;
		}
	}
}