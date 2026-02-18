import java.util.Scanner;
class PalidromePrime{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		 int temp=num;
		int rev=0;
		while(temp!=0){
			int rem=temp%10;
	        rev=rev*10+rem;
            temp/=10;			
		}
		if(num==rev){
			int den=2;
			while(den<=num/2){
				if(num%den==0){
					break;
				}
				den++;
			}
			if(den>num/2){
				System.out.println("The Number is Palidrome Prime Number");
			}else{
			System.out.println("The Number is not  Palidrome Prime Number");
		}
		}else{
			System.out.println("The Number is not Palidrome Prime Number");
		}
	}
}