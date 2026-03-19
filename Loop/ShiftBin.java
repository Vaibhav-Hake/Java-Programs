import java.util.Scanner;
class ShiftBin{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary Number");
		int bin=sc.nextInt();
		int ans=0;
		int zero=1;
		while(bin!=0){
			if(bin%10==1){
				ans=ans*10+1;
				
			}else{
				zero*=10;
			}
			bin/=10;
		}
		ans=ans*zero;
		System.out.println(ans);
	}
}