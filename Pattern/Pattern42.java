import java.util.Scanner;
class Pattern42{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int num=1;
			for(int j=0;j<n+i;j++){
				if(j<n-i-1){ 
					System.out.print(" "+" ");
				}
				else{
					if(j<n){
						System.out.print(num+" ");
						num++;
					}else{
						if(j==n){
							num-=2;
						}
						System.out.print(num+" ");
						num--;
					}
					
				}
				
			}
			System.out.println();
		} 
	}
}