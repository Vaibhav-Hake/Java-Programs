import java.util.Scanner;
class Pattern41{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int j=0;j<n;j++){
				if(i%2==0){
					System.out.print((num++)+" ");
				}
				else{
					System.out.print((ch++)+" ");
				}
			}
			System.out.println();
		}
	}
}