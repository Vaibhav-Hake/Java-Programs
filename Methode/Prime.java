import java.util.Scanner;
class Prime{ //Optimize Version
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		isPrime(num);
			
		
	}
	public static void  isPrime(int num){
		if(num==2){
			System.out.println("The Number is Prime");
		}
		else if(num==1 ||num%2==0){
			System.out.println("The Number is not Prime");
		}
		else{
			int i=3;
			for(;i*i<=num;i+=2){
				if(num%i==0){
					break;
				}
			}
			if(i*i>num){
				System.out.println("The Number is Prime ");
			}else{
				System.out.println("The Number not is Prime ");
			}
			
		}
	}
}