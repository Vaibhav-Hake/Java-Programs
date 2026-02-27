import java.util.Scanner;
class NthPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number:");
		int end=sc.nextInt();
		System.out.println("Enter a nth number for prime number:");
		int n=sc.nextInt();
		int cnt=0;
		while(start<=end){
			if(start==1){
				start++;
			}
			else{
				int den=2;
				while(den<=start/2){
					if(start%den==0){
						break;
					}
					den++;
				}
				if(den>start/2){
					cnt++;
				}
				if(cnt==n){
					System.out.println("The "+n+"th prime Number is:"+start);
					break;
				}
				start++;
			}
			
			
		}
		
	}
}