import java.util.Scanner;
class PinValidation2{
	//here We fetch stored pin From System and
//	after reached maximum
// it will stop some Time using Thred.Sleep()
	public static void main(String[]args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		int duration=2000;
		infiniteLoop:
		for(; ;){
			int attempt=0;
		do{
			System.out.println("Enter a Pin:");
			String pin=sc.next();
			String myPin=System.getenv("myPin");
			if(pin==myPin){
				System.out.println("Login Succesfully!");
				break infiniteLoop;
			}
			attempt++;
			System.out.println("Invalid pin! Your Attempt Left "+(3-attempt));
			
		}while(attempt<3);
		System.out.println("Disabled for "+duration/1000+" sec");
		Thread.sleep(duration);
		}
		
		
	}
}