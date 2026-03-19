import java.util.Scanner;
class DuckNumber{
	public static void Extract(int num){
		
		while(num!=0){
			int rem=num%10;
			if(rem==0){
				break;
			}
			num/=10;
		}
		if(num!=0){
			System.out.println("The 0 is present in Given Number");
		}else{
			System.out.println("The 0 is not present in Given Number");
		}
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		
		Extract(num);
	}
}