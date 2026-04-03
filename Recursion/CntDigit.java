import java.util.Scanner;
class CntDigit{
	public static int cnt(int num){
		  if(num==0){
			  return 0;
		  }
	return 1+ cnt(num/10);
		
	}
	public static void main(String[]args){
		System.out.println(cnt(1234));
		
	}
}