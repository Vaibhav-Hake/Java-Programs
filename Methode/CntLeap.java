import java.util.Scanner;
class CntLeap{
	public static boolean check(int year){
		return ((year%400==0)||(year%4==0&&year%100!=0));
	}
	public static int cnt(int start,int end){
		int cnt=0;
		while(start<=end){
			if(check(start)){
				cnt++;
			}
			start++;
		}
		return cnt;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Year");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Year");
		int end=sc.nextInt();
		System.out.println("The cnt of Leap Year Between "+start+" and "+end+" is "+cnt(start,end));
	}
}