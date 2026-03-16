import java.util.Scanner;
class Pattern40{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int evenDiff=2*n-1, oddDiff=1;
		
		for(int i=1;i<=n;i++){
			int temp=i;
			for(int j=1;j<=n;j++){
				System.out.print(temp+" ");
				temp=j%2!=0? temp+evenDiff: temp+oddDiff;
			}
			System.out.println();
			evenDiff-=2;
			oddDiff+=2;
		}
	}
}