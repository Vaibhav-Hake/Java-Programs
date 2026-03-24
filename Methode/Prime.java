import java.util.Scanner;
class Prime{ //Optimize Version
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(isPrime(num)){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
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
					return false;
				}
			}
			return true;
			
		}
	}
}