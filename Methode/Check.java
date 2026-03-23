import java.util.Scanner;
class Check{
	public static boolean check(int num,int n){
		
		while(num!=0){
			int rem=num%10;
			if(rem==n){
			    return true;
			}
			num/=10;
		}
		return false;
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		System.out.println("Enter a Number for check :");
		int n=sc.nextInt();
		if(check(num,n)){
			System.out.println("yes");
		}else{
			System.out.println("No");
		}
	}
}