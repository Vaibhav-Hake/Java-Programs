import java.util.Scanner;
class PinValidation{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int storedPin=1234;
		int attempt=0;
		do{
			System.out.println("Enter a Pin:");
			int pin=sc.nextInt();
			if(pin==storedPin){
				System.out.println("Login Succesfully!");
				break;
			}
			attempt++;
			System.out.println("Invalid pin! Your Attempt Left "+(3-attempt));
			
		}while(attempt<3);
		if(attempt==3){
			System.out.println("Maximum Attempt Reached!");
		}
	}
}