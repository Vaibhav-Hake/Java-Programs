import java.util.Scanner;
class Check{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		System.out.println("Enter a number which is check:");
		int ch=sc.nextInt();
		while(num!=0){
			int last=num%10;
			if(last==ch){
				break;
			}
			num/=10;
		}
		if(num!=0){
			System.out.println("The digit is Present in number:");	
		}
		else{
			System.out.println("The Digit is not present in Number:");
		}
	}
}