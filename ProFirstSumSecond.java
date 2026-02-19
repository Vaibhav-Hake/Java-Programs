import java.util.Scanner;
class proFirstSumSecondproFirstSumSecond{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int pro=1;
		int cnt=0;
		while(temp!=0){
			cnt++;
			temp/=10;
		}
		int half=cnt/2;
		while(num!=0){
			int rem=num%10;
			if(cnt>half){
				
				sum+=rem;
			}
			else{
				pro*=rem;
			}
			cnt--;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(pro);
	}
}