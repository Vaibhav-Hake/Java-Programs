import java.util.Scanner;
class NthPrimeeff{
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
			 if(start==2){
				cnt++;
				if(cnt==n){
					System.out.println("The "+n+"th prime Number is:"+start);
					break;
				}
				start++;
			}
			else if(start==1||start%2==0){
				start++;
			}
			
			else{
				int den=3;
				while(den*den<=start){
					if(start%den==0){
						break;
					}
					den++;
				}
				if(den*den>start){
					cnt++;
				}
				if(cnt==n){
					System.out.println("The "+n+"th prime Number is:"+start);
					break;
				}
				start++;
			}
			
			
		}
		if(cnt!=n){
			System.out.println("not that prime number in that range");
		}
		
	}
}