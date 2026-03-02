import java.util.Scanner;
class Range2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
	int end=sc.nextInt();
	while(start<=end){
		int temp=start+2;
		if(start==2){
			
			if(temp<=end){
				int i=3;
			for(;i*i<=start;i++){
				if(start%i==0){
					break;
				}
			}
			if(i*i>start){
				
			if(temp<=end){
				
				if(temp==2){
			System.out.println(start+" , "+temp);
		}
		else if(temp==1 || temp%2==0){
			
		}
		else{
			int j=3;
			for(;j*j<=temp;j++){
				if(temp%j==0){
					break;
				}
			}
			if(j*j>temp){
				System.out.println(start+" , "+temp);
			}
			
		}
				
			}
				
			}
			start++;
				
			}
		}
		else if(start==1 || start%2==0){
			start++;
		}
		else{
			int i=3;
			for(;i*i<=start;i++){
				if(start%i==0){
					break;
				}
			}
			if(i*i>start){
			
			if(temp<=end){
				
				if(temp==2){
			System.out.println(start+" , "+temp);
		}
		else if(temp==1 || temp%2==0){
			
		}
		else{
			int j=3;
			for(;j*j<=temp;j++){
				if(temp%j==0){
					break;
				}
			}
			if(j*j>temp){
				System.out.println(start+" , "+temp);
			}
			
		}
				
			}
				
			}
			start++;
			
		}
	}
	}
}