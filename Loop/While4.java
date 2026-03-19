import java.util.Scanner;
class While4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		int count=1;
		while(count<=10){
			System.out.println(no+" * "+count+" = "+(no*count));
			count++;
		}
	}
}