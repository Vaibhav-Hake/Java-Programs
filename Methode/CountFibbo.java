import java.util.Scanner;
class CountFibbo{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a starting Number");
	     int start=sc.nextInt();
		 System.out.println("Enter a Endinging Number");
	     int end=sc.nextInt();
		System.out.println( fibbo(start,end));
	}
	public static int fibbo(int start,int end){
		int n1=0,n2=1,ans,cnt=0;
		while(n1<=end){
			ans=n1+n2;
			if(n1>=start){
				cnt++;
			}
			n1=n2;
			n2=ans;
		}
		return cnt;
	}
}