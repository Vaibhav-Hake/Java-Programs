import java.util.Scanner;
class RangeTwinPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Starting Number");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number");
		int end=sc.nextInt();
		while(start<=end){
			if(start==1){
				start++;
			}
			else{
					int temp=start+2;
				int den=2;
				while(den<=start/2){
					if(start%den==0){
						break;
					}
					den++;
				}
				if(den>start/2){
				//for range 
				if(temp<=end){
						 den=2;
				while(den<=temp/2){
					if(temp%den==0){
						break;
					}
					den++;
				}
				if(den>temp/2){
					System.out.println(start+" ,"+temp);
				}
				
				}	
				}
				start++;
			}
		}
	}
}