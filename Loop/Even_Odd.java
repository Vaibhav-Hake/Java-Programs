import java.util.Scanner;
class Even_Odd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println(num+" It is a Even Number");
		}
		else{
			System.out.println(num+" It is a Odd Number");
		}
	}
}