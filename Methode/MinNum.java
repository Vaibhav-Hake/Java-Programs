import java.util.Scanner;
class MinNum{
	public static int min(int num){
		int min=9;
		while(num!=0){
			if(num%10<min){
				min=num%10;
			}
			num/=10;
		}
		return min;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
	    int num=sc.nextInt();
		System.out.println(min(num));
	}
}