import java.util.Scanner;
class AutoMarphic1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int d=1;
		int sq=num*num;
		for(int i=num;i!=0;i/=10){
			d*=10;
		}
		if(sq%d==num){
			System.out.println("The Number is AutoMarphic Number");
		}
		else{
			System.out.println("The Number is Not Automarphic Number");
		}
	}
}