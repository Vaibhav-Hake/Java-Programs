import java.util.Scanner;
class RangeArmStrong{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number");
		int end=sc.nextInt();
		while(start<=end){
			int temp=start;
			int cnt=0;
			for(int i=temp;i!=0;i/=10){
				cnt++;
			}
			int sum=0;
			while(temp!=0){
				int rem=temp%10;
				int pow=1;
				for(int i=0;i<cnt;i++){
					pow*=rem;
				}
				sum+=pow;
				temp/=10;
			}
			if(start==sum){
				System.out.println(start);
			}
			start++;
		}
	}
}