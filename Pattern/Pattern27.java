import java.util.Scanner;
class Pattern27{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			int k=i;
			for(int j=0;j<n;j++){
				
				System.out.print(k+" ");
				k+=n;
			}
			
			System.out.println();
			
		}
	}
}