import java.util.Scanner;
class Pattern11{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int num=1;
		for(int i=0;i<n;i++){
			
			int cnt=0;
			while(cnt<=n){   
				if(isPrime(num)){
					System.out.print(num+" ");
					cnt++;
				}
				num++;
			}
			System.out.println();
			
		}
	}
	public static boolean  isPrime(int num){
		if(num==2){
			return true;
		}
		else if(num==1 ||num%2==0){
			return false;
		}
		else{
			int i=3;
			for(;i*i<=num;i+=2){
				if(num%i==0){
					return false;
				}
			}
			return true;
			
		}
	}
}