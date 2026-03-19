import java.util.Scanner;
class XylemPhloem{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(num<100){
			System.out.println("Enter a valid NUMBER for check");
		}
		else{
			int end=num%10;
		num=num/10;
		int sum=0;
		while(num>9){
			int last=num%10;
			sum+=last;
			num/=10;
		}  
		end+=num;
		if(sum==end){
			System.out.println("The number is Xylem");
		}else{
			System.out.println("The number is Phloem");
		}
		}
	}
}