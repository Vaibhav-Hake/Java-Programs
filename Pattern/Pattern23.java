import java.util.Scanner;
class Pattern23{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a='a';
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}
}