import java.util.Scanner;
class Ugly{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		while(true){
			if(num%2==0){
				num/=2;
			}
			else if(num%3==0){
				num/=3;
			}
			else if(num%5==0){
				num/=5;
			}else{
				break;
			}
			
		}
		if(num==1){
			System.out.println("UglyNnumber");
		}
		else{
			System.out.println("not UglyNnumber");
		}
	}
}