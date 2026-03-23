import java.util.Scanner;
class LeapYear{
	public static boolean checkLeap(int y){
		if((y%400==0)|| (y%4==0&&y%100!=0)){
			return true;
		}
		else{
			return false;
		}
		//best optimize 
		//return ((y%400==0)|| (y%4==0&&y%100!=0))
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int y=sc.nextInt();
		if(checkLeap(y)){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap");
		}
	}
}