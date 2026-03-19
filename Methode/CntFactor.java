import java.util.Scanner;
class CntFactor{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println(CFact(num));
	}
	public static int CFact(int num){
		int den=1;
		int cnt=1;
		while(den<=num/2){
			if(num%den==0){
				cnt++;
			}
			den++;
		}
		return cnt;
	
	}
}
