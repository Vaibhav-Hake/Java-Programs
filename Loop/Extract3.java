import java.util.Scanner;
class Extract3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		while(num>0){
			int last=num%10;
			if(last%2==0){
				System.out.println(last);
			}
			num/=10;
		}
	}
}