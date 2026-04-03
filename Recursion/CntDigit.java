import java.util.Scanner;
class CntDigit{
	public static int cnt(int num,int cnt){
		return num==0?cnt:cnt(num/10,cnt+1);
		  
		
	}
	public static void main(String[]args){
		System.out.println(cnt(123654789,0));
		
	}
}