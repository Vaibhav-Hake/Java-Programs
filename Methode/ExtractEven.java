import java.util.Scanner;
class ExtractEven{
	public static void Extract(int num){
		
		while(num!=0){
			int rem=num%10;
			if(rem%2==0){
				System.out.println(rem);
			}
			num/=10;
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		Extract(num);
	}
}