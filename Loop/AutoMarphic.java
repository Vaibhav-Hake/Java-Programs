import java.util.Scanner;
class AutoMarphic{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sq=num*num;
		int temp=num;
		int cnt=0;
		while(temp!=0){
			cnt++;
			temp/=10;
		}
		int d=1;
		for(int i=0;i<cnt;i++){
			d*=10;
		}
		if(sq%d==num){
			System.out.println("The Number is AutoMarphic Number");
		}
		else{
			System.out.println("The Number is Not AutoMarphic Number");
		}
	}
}