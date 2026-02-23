import java.util.Scanner;
class PronicNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int i=0;
		for(;i*(i+1)<=num;i++){
			if(i*(i+1)==num){
				System.out.println("The nnumber is Pronic Number");
				break;
			}
		}
		if(i*(i+1)>num){
			System.out.println("The Number is Not Pronic Number");
		}
	}
}