import java.util.Scanner;
class EvenOddCnt{
	public static void Extract(int num){
		int even=0,odd=0;
		while(num!=0){
			int rem=num%10;
			if(rem%2==0){
			  even++;	
			}else{
				odd++;
			}
			num/=10;
		}
		System.out.println("The Count of Even Number is  "+even);
		System.out.println("The Count of Odd Number is  "+odd);
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		Extract(num);
	}
}