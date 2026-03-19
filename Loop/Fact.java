import java.util.Scanner;
class Fact{
	public static  void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int res=1;
		while(num>1){
			res=res*num;
			num--;
		}
		System.out.println("The Factorial value of Your Input is : "+res);
		
	} 
}
