import java.util.Scanner;
class LeapYear{
	//Leap Year Check
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int y=sc.nextInt();
		if((y%400==0)||(y%4==0&&y%100!=0)){
			System.out.println(y+"it is a Leap Year");
		}
		else{
			System.out.println(y+"it is not a Leap Year");
		}
	}
}