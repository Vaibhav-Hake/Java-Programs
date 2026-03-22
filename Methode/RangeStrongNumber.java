import java.util.Scanner;
class RangeStrongNumber{
	public static int factorial(int num){
		int fact=1;
		while(num>1){
			fact*=num;
			num--;
		}
		return fact;
	}
	public static int sum(int num){
		int sum=0;
		while(num!=0){
			sum+=factorial(num%10);
			num/=10;
		}
		return sum;
	}
	public static boolean isStrong(int num){
		return num==sum(num);
	}
	public static void strongNumber(int start,int end){
		while(start<=end){
			if(isStrong(start)){
				System.out.println(start);
			}
			start++;
		}
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting Number Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number Number:");
		int end=sc.nextInt();
		strongNumber(start,end);
		
		
	}
}