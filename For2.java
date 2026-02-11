import java.util.Scanner;
class For2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Starting Number:");
		int end=sc.nextInt();
		for(int no=start;no<=end;no++){
			System.out.println(no);
		}
	}
}