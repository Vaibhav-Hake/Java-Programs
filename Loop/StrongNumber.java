import java.util.Scanner;
class StrongNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0){
			int rem=num%10;
			
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if(sum==temp){
			System.out.println("The "+temp+" is Strong Number");
		}else{
			System.out.println("The "+temp+" is Not Strong Number");
		}
	}
}