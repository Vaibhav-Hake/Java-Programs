import java.util.Scanner;
class AlternativeBin{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary Number");
		int bin=sc.nextInt();
		int one=0,zero=0,ans=0;
		for(int i=bin;i!=0;i/=10){
			if(i%10==1){
				one++;
			}else{
				zero++;
			}
		}
		while(one>0&&zero>0){
			
				ans=(ans*10+1)*10;
				one--;
				zero--;
			
		}
		while(one>0){
			ans=ans*10+1;
			one--;
		}
		while(zero>0){
			ans=ans*10;
			zero--;
		}
		System.out.println(ans);
	}
}