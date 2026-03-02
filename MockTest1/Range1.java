import java.util.Scanner;
class Range1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strat Number:");
		int start=sc.nextInt();
		System.out.println("Enter a End Number:");
		int end=sc.nextInt();
		while(start<=end){
			if(start==2){
			System.out.println(start);
			start++;
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
				System.out.println(start);
			}
			start++;
		}
		}
	}
}