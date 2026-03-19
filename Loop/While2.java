import java.util.Scanner;
class While2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Starting Number:");
			int end=sc.nextInt();
			while(start<=end){
				System.out.println(start);
				start++;
			}
	}
}