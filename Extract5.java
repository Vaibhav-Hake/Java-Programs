import java.util.Scanner;
class Extract5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		while(num>0){
			int last=num%10;
			if(last%2==0){
				even++;
			}
			else{
				odd++;
			}
			num/=10;
		}
		System.out.println("The count of Even Digit in Number is :"+even);
		System.out.println("The count of Odd    in Number is :"+odd);
	}
}