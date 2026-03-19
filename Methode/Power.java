import java.util.Scanner;
class Power{
	public static void pow(int num,int p){
		int pow=1;
		for(int i=0;i<p;i++){
			pow*=num;
		}
		System.out.println(pow);
		
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num=sc.nextInt();
		System.out.println("Enter a Power Value ");
		int p=sc.nextInt();
		pow(num,p);
		
	}
}