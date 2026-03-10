import java .util.Scanner;
class Pattern32{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int space=n/2 , star=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print(" "+" ");
			}
			for(int j=0;j<star;j++){
				System.out.print("*"+"   ");
			}
			System.out.println();
			if(i<n/2){
				space--;
				star++;
			}else{
				space++;
				star--;
			}
		}
	}
}