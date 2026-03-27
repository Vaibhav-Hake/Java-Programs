import java.util.Scanner;
class Freq{
	public static void calFreq(int num){
		
		for(int i=0;i<=9;i++){
			int cnt=0;
			int temp=num;
			while(temp!=0){
				int last=temp%10;
				if(last==i){
					cnt++;
				}
				temp/=10;
			}
			if(cnt>0){
				System.out.println(i+"--->"+cnt);
			}
		}
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		calFreq(num);
	}
}