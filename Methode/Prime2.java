import java.util.Scanner;
class Prime2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
	    isPrime(num);	
	}
	public static void isPrime(int num){
		int den=2;
		while(den<=num/2){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(den>num/2){
			System.out.println("The Number is  Prime");
		}else{
			System.out.println("The Number is not Prime");
		}
	}
}