import java.util.Scanner;
class Rev{
	public static void rev(int num){
         int rev=0; 
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		rev(num);
		
	}
}