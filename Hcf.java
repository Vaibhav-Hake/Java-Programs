import java.util.Scanner;
class Hcf{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		int n1=sc.nextInt();
		System.out.println("Enter a Second Number");
		int n2=sc.nextInt();
		int small=n1<n2?n1:n2;
		
		while(true){
			if(n1%small==0&&n2%small==0){
				System.out.println("The HCF/GCD of "+n1+" and "+n2+" is "+small);
				break;
			}
			small--;
		}
	}
}