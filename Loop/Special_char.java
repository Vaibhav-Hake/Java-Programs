import java.util.Scanner;
class Special_char{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Chracter:");
		char ch=sc.next().charAt(0);
		String op=(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')?ch+" it is not Special Character":ch+" it is Special Character";
		System.out.println(op);
	}
}