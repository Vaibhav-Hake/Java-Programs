import java.util.Scanner;
class Pattern24{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a='a';
		int num=1;
		for(int i=0;i<2*n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a+" ");
				
				if(num<10){
					System.out.print(num+"  ");
				}else{
					System.out.print(num+" ");
				}
				a++;
				num++;
			}
			System.out.println();
		}
	}
}