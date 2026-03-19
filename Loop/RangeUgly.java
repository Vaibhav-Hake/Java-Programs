import java.util.Scanner;
class RangeUgly{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat no:");
		int start=sc.nextInt();
		System.out.println("Enter a End no:");
		int end=sc.nextInt();
		while(start<=end){
			if(start<=0){
				start++;
			}else{
			int temp=start;
			while(temp!=1){
				if(temp%2==0){
					temp/=2;
				}
				else if(temp%3==0){
					temp/=3;
				}
				else if(temp%5==0){
					temp/=5;
				}
				else{
					break;
				}
			}if(temp==1){
				System.out.println(start);
			}
			
			start++;
			}
		}
	}
}