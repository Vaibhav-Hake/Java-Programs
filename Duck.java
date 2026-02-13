import java.util.Scanner;
class Duck{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while(num!=0){
			int last=num%10;
			if(last==0){
				break;
			}
			num/=10;
			
		}
		if(num!=0){
			System.out.println("The Number is Duck Number");
		}
		else{
			System.out.println("The Number is not Duck Number");
		}
	}
}