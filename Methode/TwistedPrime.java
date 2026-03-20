import java.util.Scanner;
class TwistedPrime{ //Optimize Version
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(isPrime(num)&&isPrime(rev(num))){
			System.out.println("The Number is Twisted Prime Number");
		}else{
			System.out.println("The Number is Not  Twisted Prime Number");
		}
			
		
	}
	public static boolean  isPrime(int num){
		if(num==2){
			return true;
		}
		else if(num==1 ||num%2==0){
			return false;
		}
		else{
			int i=3;
			for(;i*i<=num;i+=2){
				if(num%i==0){
					break;
				}
			}
			if(i*i>num){
				return true;
			}else{
                return false;
			}
			
		}
	}
	public static int rev(int num){
		int rev=0;
		while(num!=0){
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
}