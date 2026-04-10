import java.util.Scanner;
class UglyNumber{
	public static boolean isUgly(int num){
		if(num<1){
			return false;
		}
		else{
			while(num>1){
				if(num%2==0){
					num/=2;
				}
				else if(num%3==0){
					num/=3;
				}
				else if(num%5==0){
					num/=5;
				}
				else{
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[]args){
		System.out.println(isUgly(5));
	}
}