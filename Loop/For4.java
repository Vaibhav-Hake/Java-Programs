import java.util.Scanner;
class For4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int no=sc.nextInt();
		for(int count=1;count<=10;count++){
			System.out.println(no+" * "+count+" = "+(no*count));
		}
	}
}
