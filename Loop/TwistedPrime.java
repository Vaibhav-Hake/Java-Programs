import java.util.Scanner;
class TwistedPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int den=2;
		while(den<=num/2){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(den>num/2){
			int temp=num;
			int rev=0;
			while(temp!=0){
				int rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			 den=2;
			while(den<=rev/2){
				if(rev%den==0){
				break;
			}
			den++;
			}
			if(den>rev/2){
				System.out.println("The Number is  Twisted Prime Number");
			}else{
			System.out.println("The Number is Not Twisted Prime Number");
		}
			
		}else{
			System.out.println("The Number is Not Twisted Prime Number");
		}
	}
}