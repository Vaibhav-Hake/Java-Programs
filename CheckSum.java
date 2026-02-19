import java.util.Scanner;
class CheckSum{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int temp=num;
		int sum1=0;
		int sum2=0;
		int cnt=0;
		while(temp!=0){
			cnt++;
			temp/=10;
		}
		int half=cnt/2;
		while(num!=0){
			int rem=num%10;
			if(cnt>half){
				
				sum1+=rem;
			}
			else{
				sum2+=rem;
			}
			cnt--;
			num/=10;
		}
		if(sum1==sum2){
			System.out.println("The Sum of 1st half and 2nd half is Same");
		}else{
			System.out.println("The Sum of 1st half and 2nd half is not Same");
		}
	}
}