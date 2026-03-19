import java.util.Scanner;
class PrimeFactor{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int start=2;
		while(start<=num){
			int den=2;
			while(den<=start/2){
				if(start%den==0){
					break;
				}
				den++;
			}
			if(den>start/2){
				if(num%start==0){
					System.out.println(start);
				}
			}
			start++;
		}
	}
}