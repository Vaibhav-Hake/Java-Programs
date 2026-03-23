import java.util.Scanner;
class DuckNumber{
	public static boolean check(int num){
		
		while(num!=0){
			int rem=num%10;
			if(rem==0){
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
		if(check(num)){
			System.out.println("DuckNumber");
		}else{
			System.out.println("NotDuck Number");
		}
	}
}