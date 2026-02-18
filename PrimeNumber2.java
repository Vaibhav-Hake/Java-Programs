import java.util.Scanner;
class PrimeNumber2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=2;
		/*if(num<=1){
			System.out.println("The number is not prime");
	
		}*/
		while(den<=num/2){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(den>num/2){
			System.out.println("The Given Number is Prime number");
		}
		else{
			System.out.println("The Given Number is not Prime nmber");
		}
	}
}