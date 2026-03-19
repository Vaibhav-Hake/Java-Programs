import java.util.Scanner;
class Factor{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		Fact(num);
	}
	public static void Fact(int num){
		int den=1;
		while(den<=num/2){
			if(num%den==0){
				System.out.print(den+"  ");
			}
			den++;
		}
		System.out.println(num);
	}
}
