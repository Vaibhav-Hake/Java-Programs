import java.util.Scanner;
class SumPrime{
	public static boolean isPrime(int num){
		if(num==2){
			return true;
			
		}
		else if(num==1||num%2==0||num<1){
			return false;
		}
		else{
			for(int i=3;i*i<=num;i+=2){
				if(num%i==0){
					return false;
				}
			}
			return true;
		}
	}
	public static int sumOfPrime(int n){
		int sum=0;
		for(int i=2;i<=n;i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a n Value");
		int n=sc.nextInt();
		System.out.println(sumOfPrime(n));
	}
}