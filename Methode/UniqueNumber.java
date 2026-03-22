import java.util.Scanner;
class UniqueNumber{
	public static boolean check(int num){
		while(num!=0){
			int rem=num%10;
			int temp=num/10;
			int i=temp;
			for(;i!=0;i/=10){
				if(i%10==rem){
				    return false;
				}
			}
			num/=10;
		}
		return true;
	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(check(num)){
			System.out.println("The number is Unique");
		}else{
			System.out.println("The number is not unique");
		}
	}
}