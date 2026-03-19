import java.util.Scanner;
class FactorCnt{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int cnt=1;
		int den=1;
		while(den<=num/2){
			if(num%den==0){
				cnt++;
			}
			den++;
		}
		System.out.println(cnt);
	}
}