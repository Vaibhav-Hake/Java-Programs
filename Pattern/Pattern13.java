import java.util.Scanner;
class Pattern13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				if(j>n-1-i){
					System.out.print(" "+" ");
				}else{
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
		}
	}
}