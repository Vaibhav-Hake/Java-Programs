import java.util.Scanner;
class RangeHappyNumber{
	public static int sumSqDigit(int num){
		
		int sum=0;
		while(num!=0){
			int last=num%10;
			sum+=(last*last);
			num/=10;
		}
		return sum;
	}
	public static boolean isHappy(int num){
		int sum=sumSqDigit(num);
		while(sum!=1&&sum!=4){
			sum=sumSqDigit(sum);
		}
		return sum==1;
	}
	public static void printHappy(int start ,int end){
		while(start<=end){
			if(isHappy(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Starting number");
		int start=sc.nextInt();
		System.out.println("Enter a  Ending number");
		int end=sc.nextInt();
		printHappy(start,end);
		
	}
}