import java.util.Scanner;
class Palidrome{
	public static int rev(int num,int rev){
		return num==0?rev:rev(num/10,rev*10+num%10);
	}
	public static boolean isPalidrome(int num){
		return num==rev(num,0);
	}
	public static void main(String[]args){
		System.out.println(isPalidrome(122));
	}
}