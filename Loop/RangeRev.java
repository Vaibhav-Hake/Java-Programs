import java.util.Scanner;
class RangeRev{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat no:");
		int start=sc.nextInt();
		System.out.println("Enter a End no:");
		int end=sc.nextInt();
		while(start<=end){
			int rev=0;
			for(int i=start;i!=0;i/=10){
				rev=rev*10+i%10;
			}
			System.out.println(rev);
			start++;
		}
	}
}