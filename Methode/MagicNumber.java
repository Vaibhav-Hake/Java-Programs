import java.util.Scanner;
class MagicNumber{
	public static int sum(int num){
		int sum=0;
		while(num!=0){
			sum+=num%10;
			num/=10;
			
		}
		return sum;
	}
	public static boolean isMagic(int num){
		int sum=sum(num);
		while(sum>9){
			sum=sum(sum);
		}
		return sum==1;
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(isMagic(num)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
	}
}