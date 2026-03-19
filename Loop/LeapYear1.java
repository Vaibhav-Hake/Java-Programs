import java.util.Scanner;
class LeapYear1{
	//Count of leap Year 
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Year");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Year");
		int end=sc.nextInt();
		int count=0;
		for(int temp=start;temp<=end;temp++){
			if(temp%400==0 ||(temp%4==0 && temp%100!=0)){
				count++;
			}
		}
		System.out.println("The count of Leap Year betWeen "+start+" to "+end+" is "+count);
	}
}