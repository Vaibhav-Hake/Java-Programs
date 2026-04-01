import java.util.Scanner;
class CntDigit{
		public static void freq(int num){
			
			for(int i=0;i<=9;i++){
				int cnt=0;
				for(int j=num;j!=0;j/=10){
                    if(j%10==i){
						cnt++;
					}
				}		
				if(cnt>0){
					System.out.println(i+" --->> "+cnt);
				}
			}
			
		}
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number");
			int num=sc.nextInt();
			freq(num);
		}
}