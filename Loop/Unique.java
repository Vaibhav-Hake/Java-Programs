import java.util.Scanner;
class Unique{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		while(num!=0){
			int rem=num%10;
			int temp=num/10;
			int i=temp;
			for(;i!=0;i/=10){
				if(i%10==rem){
					break;
				}
			}
			if(i!=0){
				
				break;
			}
			num/=10;
		}
		if(num==0){
			System.out.println("The givem number is  Unique");
		}else{
			System.out.println("The givem number is not Unique");  
		}
	}
}