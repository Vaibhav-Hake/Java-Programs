import java.util.Scanner;
class FibboPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int n1=0,n2=1,ans;
		while(true){
	
			if(n1==num){
				
				int den=2;
				while(den<=num/2){
					if(num%den==0){
						break;
					}
					den++;
				}
				if(den>num/2){
					System.out.println("The Give Number is  Prime Fibonacci Number");
			            break;
				}else{
					System.out.println("The Give Number is Not Prime Fibonacci Number");
			            break; 
					
				}
				
			}else if(n1>num){
				System.out.println("The Give Number is Not Prime Fibonacci Number");
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