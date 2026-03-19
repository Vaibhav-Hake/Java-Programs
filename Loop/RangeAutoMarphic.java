import java.util.Scanner;
class RangeAutoMarphic{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat no:");
		int start=sc.nextInt();
		System.out.println("Enter a End no:");
		int end=sc.nextInt();
		while(start<=end){
			int temp=start;
			int sq=temp*temp;
			int d=1;
			for(int i=temp;i!=0;i/=10){
				d*=10;
			}
			if(sq%d==start){
				System.out.println(start);
			}
			
			start++;
		}
	}
}