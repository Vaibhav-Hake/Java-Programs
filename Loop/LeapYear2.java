import java.util.Scanner;
class LeapYear2{
	//Print leap year between start year and year   
	public static void main(String[]args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Starting Year:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Year:");
		int end=sc.nextInt();
		while(start<=end){
			if(start%400==0||(start%4==0&&start%100!=0)){
				System.out.println(start);
			}
			start++;
		}
	}
}