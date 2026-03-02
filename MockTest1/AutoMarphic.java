import java.util.Scanner;
class AutoMarphic{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int d=1;
		for(int i=num;i!=0;i/=10){
			d*=10;
		}
		int sq=num*num;
		if(sq%d==num){
			System.out.println("AutoMarphic");
		}else{
			System.out.println("not AutoMarphic");
		}
	} 
}