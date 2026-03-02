import java.util.Scanner;
class ArmStrong{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=num;i!=0;i/=10){
			cnt++;
		}
		int sum=0;
		for(int j=num;j!=0;j/=10){
			int rem=j%10;
			int pow=1;
			for(int i=0;i<cnt;i++){
				pow*=rem;
			}
			sum+=pow;
		}
		if(sum==num){
			System.out.println("ArmStrong Number");
		}else{
			System.out.println(" not ArmStrong Number");
		}
	}
}