import java.util.Scanner;
class Factorial{
	public static int fact(int num){
		if(num==0){
			return 1;
		}
		return num*fact(num-1);
		
		//return num==0 ? 1:num*fact(num-1);
	}
	public static void main(String[]args){
		System.out.println(fact(5));
	}
}