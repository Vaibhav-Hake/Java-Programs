import java.util.Scanner;
class RotatedNumberAll{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
	    int temp=num;
		int d=1;
		for(int i=num/10;i!=0;i/=10){
			d*=10;
		}
		int rot=0;
		while(true){
			int rem=num%10;
		 rot=rem*d+(num/=10);
		 if(rot==temp){
			break;
		}
		System.out.println(rot);
		num=rot;
			
		}
		
	}
}

