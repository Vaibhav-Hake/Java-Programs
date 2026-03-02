import java.util.Scanner;
class Count{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
		int end=sc.nextInt();
		int n=0;
		while(start<=end){
			int cnt=0;
		for(int i=start;i!=0;i/=10){
			cnt++;
		}
		int sum=0;
		for(int j=start;j!=0;j/=10){
			int rem=j%10;
			int pow=1;
			for(int i=0;i<cnt;i++){
				pow*=rem;
			}
			sum+=pow;
		}
		if(sum==start){
			n++;
		}
		start++;
		}
		System.out.println(n);
    }
}