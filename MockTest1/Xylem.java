import java.util.Scanner;
class Xylem{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int end=num%10;
		num/=10;
		int sum=0;
		while(num>9){
			sum+=(num%10);
			num/=10;
		}
		end=end+num;
		if(end==sum){
			System.out.println("Xylem");
		}else{
			System.out.println("Pholem");
		}
	}
}