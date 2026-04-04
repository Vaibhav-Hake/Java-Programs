import java.util.Scanner;
class Prime{
	public static boolean isPrime(int num,int den){
		if(den*den<=num){
			if(num%den==0){
				return false;
			}else{
				return isPrime(num,den+1);
			}
			
		}else{
			return true;
		}
	}
	public static void main(String[]args){
		System.out.println(isPrime(4,2));
	}
}