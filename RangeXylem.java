import java.util.Scanner;
class RangeXylem{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat no:");
		int start=sc.nextInt();
		System.out.println("Enter a End no:");
		int end1=sc.nextInt();
		while(start<=end1){
			if(start<100){
				start++;
			}else{
			int temp=start;
			int end=temp%10;
			temp/=10;
			int sum=0;
			while(temp>9){
				sum+=temp%10;
				temp/=10;
			}
			end+=temp;
			if(sum==end){
				System.out.println(start);
			}
			
			start++;
			}
		}
	}
}