import java.util.Scanner;
class PerfectNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(isPerfect(num)){
			System.out.println("PerFect Number");
		}else{
			System.out.println("Not PerfectNumber");
		}
		
	}
	public static int sum(int num){
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
	public static boolean isPerfect(int num){
		return sum(num)==num;
	}
}
