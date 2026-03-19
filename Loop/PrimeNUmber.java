import java.util.Scanner;
class PrimeNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int den=2;
		while(den<num){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(den==num){
			System.out.println("The Given Number is Prime number");
		}
		else{
			System.out.println("The Given Number is not Prime nmber");
		}
	}
}