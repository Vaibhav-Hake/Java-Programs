import java.util.Scanner;
class MaxNum{
	public static int max(int num){
		int max=0;
		while(num!=0){
			if(num%10>max){
				max=num%10;
			}
			num/=10;
		}
		return max;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
	    int num=sc.nextInt();
		System.out.println(max(num));
	}
}