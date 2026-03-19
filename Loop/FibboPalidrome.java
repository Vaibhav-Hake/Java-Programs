import java.util.Scanner;
class FibboPalidrome{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int n1=0,n2=1,ans;
		while(true){
	
			if(n1==num){
				int temp=num;
				int rev=0;
				while(temp!=0){
					int rem=temp%10;
					rev=rev*10+rem;
					temp/=10;
				}
				if(num==rev){
					System.out.println("The Give Number is  Palidrome Fibonacci Number");
			            break;
				}else{
					System.out.println("The Give Number is Not Palidrome Fibonacci Number");
			            break; 
					
				}
				
			}else if(n1>num){
				System.out.println("The Give Number is Not Palidrome Fibonacci Number");
			    break;
			}
			else{
				ans=n1+n2;
				n1=n2;
				n2=ans;
			}
		}
	}
}