import java.util.Scanner;
class Pattern13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int n1=0,n2=1,ans=0;
		for(int i=n-1;i>=0;i--){
			for(int j=n-1;j>=0;j--){
				if(j>=i){
					System.out.print(n1+" ");
					ans=n1+n2;
					n1=n2;
					n2=ans;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}