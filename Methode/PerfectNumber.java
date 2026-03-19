import java.util.Scanner;
class PerfectNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(pNumber(num)==num){
			System.out.println("PerFect Number");
		}else{
			System.out.println("Not PerfectNumber");
		}
		
	}
	public static int pNumber(int num){
		int den=1;
		int sum=0;
		while(den<=num/2){
			if(num%den==0){
				sum+=den;
			}
			den++;
		}
		return sum;
	
	}
}
