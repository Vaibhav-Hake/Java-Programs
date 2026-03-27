import java.util.Scanner;
class DualBasedPalidrome{
	public static int rev(int num){
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}
	public static boolean isPalidrome(int num){
		return rev(num)==num;
	}
	public static int DToB(int num){
		int bin=0;
		int pos=1;
		while(num!=0){
			int last=num%2;
			bin=bin+last*pos;
			pos*=10;
			num/=2;
		}
		return bin;
	}
	public static void print(int n){
	  int start=1;
	  while(start<=n){
		  if(isPalidrome(start)&&isPalidrome(DToB(start))){
			  System.out.println(start);
		  }
		  start++;
	  }
		
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		print(num);
	}
}