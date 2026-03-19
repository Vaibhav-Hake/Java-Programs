import java.util.Scanner;
class NeaonNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sq=num*num;
		int sum=0;
		while(sq>0){
			int last=sq%10;
			sum+=last;
			sq/=10;
		}
		if(sum==num){
			System.out.println("The Number is Neaon Number");
		}
		else{
			System.out.println("The Number is not Neaon Number");
		}
	}
}