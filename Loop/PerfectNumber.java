import java.util.Scanner;
class PerfectNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int sum=0;
		int den=1;
		while(den<=num/2){
			if(num%den==0){
				sum+=den;
			}
			den++;
		}
		if(sum==num){
			System.out.println("Given Number is Perfect Number");
		}
		else{
				System.out.println("Given Number is not Perfect Number");
		}
	}
}