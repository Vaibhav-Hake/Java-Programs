import java.util.Scanner;
class RangeStrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number:");
		int end=sc.nextInt();
		while(start<=end){
			int sum=0;
			int temp=start;
			while(temp!=0){
				int rem=temp%10;
				int pow=1;
				for(int i=1;i<=rem;i++){
					pow*=i;
				}
				sum+=pow;
				temp/=10;
			}
			if(sum==start){
					System.out.println(start);  
				}
			start++;
		}
	}
}