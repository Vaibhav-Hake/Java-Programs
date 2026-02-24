import java.util.Scanner;
class PrimeBySq{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		if(num==2){
			System.out.println("The Nnumber is Prime");
		}else if(num==1||num%2==0){
			System.out.println("The Number is Not prime");
		}else{
			int i=3;
			for(;i*i<=num;i+=2){
				if(num%i==0){
					break;
				}
			}
			if(i*i>num){
				System.out.println("Prime");
			}else{
				System.out.println("not primer");
			}
		}
	}
}