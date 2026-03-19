import java.util.Scanner;
class TwinPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number1");
		int num1=sc.nextInt();
		System.out.println("Enter a Number2");
		int num2=sc.nextInt();
		if(num1-num2==2||num1-num2==-2){
			if(num1==1){
					System.out.println("The Number is Not Twin Number");
				
			}else{
				int den=2;
				while(den<=num1/2){
					if(num1%den==0){
						break;
					}
					den++;
				}
				if(den>num1/2){
					den=2;
					while(den<=num2/2){
					if(num2%den==0){
						break;
					}
					den++;
				}
				if(den>num2/2){
						System.out.println("The Number is  Twin Number");
				}else{
						System.out.println("The Number is Not Twin Number");
				}
					
				}else{
						System.out.println("The Number is Not Twin Number");
				}
			}
			
		}else{
			System.out.println("The Number is Not Twin Number");
		}
	}
}