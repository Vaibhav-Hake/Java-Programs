import java.util.Scanner;
class Freq{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		freq(num);
		
	}
	public static void freq(int num){
		for(int i=0;i<=9;i++){
			int cnt=0;
			for(int j=num;j!=0;j/=10){
				if(j%10==i){
					cnt++;
				}
			}
			if(cnt>0){
				System.out.println(i+" --->"+cnt);
			}
		}
	}
}