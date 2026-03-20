import java.util.Scanner;
class Palidrome{
	public static int rev(int num){
         int rev=0; 
		while(num!=0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static boolean isPalidrome(int num){
		return rev(num)==num; 
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		if(isPalidrome(num)){
			System.out.println("The Number is Palidrome");
		}else{
			System.out.println("The Number is Not Palidrome");
		}
		
	}
}