import java.util.Scanner;
class SortNumber{
		public static int sort(int num){
			int sort=0;
			for(int i=0;i<=9;i++){
				int cnt=0;
				int temp=num;
				while(temp!=0){
					if(temp%10==i){
						cnt++;
					}
					temp/=10;
				}
				for(int j=1;j<=cnt;j++){
					sort=sort*10+i;
				}	
			}
			return sort;
		}
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a Number");
			int num=sc.nextInt();
			System.out.println(sort(num));
		}
}