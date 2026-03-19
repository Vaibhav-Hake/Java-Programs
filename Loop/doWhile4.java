import java.util.Scanner;
class doWhile4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		int count=1;
		do{
			System.out.println(no+" * "+count+" = "+(no*count));
			count++;
		}while(count<=10);
	}
}