import java.util.Scanner;
class TechNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int cnt=0;
		int temp=num;
		for(int i=num;i!=0;i/=10){
			cnt++;
		}
		if(cnt%2==0){
			int d=1;
			for(int i=0;i<cnt/2;i++){
				d*=10;
			}
			int end=temp%d;
			temp=temp/d;
			temp+=end;
			temp*=temp;
			if(temp==num){
				System.out.println("The Number is Tech Number");
			}else{
				System.out.println("The Number is Not Tech Nnumber");
			}
		}else{
			System.out.println("Not Tech");
		}
	}
}