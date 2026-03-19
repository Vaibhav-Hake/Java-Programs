import java.util.Scanner;
class Check{
	public static void Extract(int num,int n){
		
		while(num!=0){
			int rem=num%10;
			if(rem==n){
				break;
			}
			num/=10;
		}
		if(num!=0){
			System.out.println("The "+n+" is present in Given Number");
		}else{
			System.out.println("The "+n+" is not present in Given Number");
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		System.out.println("Enter a Number for check :");
		int n=sc.nextInt();
		Extract(num,n);
	}
}