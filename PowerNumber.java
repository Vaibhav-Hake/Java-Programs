import java.util.Scanner;
class  PowerNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		double num=sc.nextInt();
		System.out.print("Enter a Power:");
		double power=sc.nextInt();
		if(power<0){
			power*=-1;
			num=1/num;
		}
		double op=1;
		for(int i=0;i<power;i++){
			op*=num;
		}
		System.out.println("User Defined  "+op);
		System.out.println("Built in  "+Math.pow(num,power));
		
	}
}