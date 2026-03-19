import java.util.Scanner;
class Factorial{
	public static void Factorial(int num){
         int fact=1; 
		while(num!=0){
			fact*=num;
			num--;
		}
		System.out.println(fact);
		
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		Factorial(num);
		
	}
}