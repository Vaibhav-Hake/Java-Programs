import java.util.Scanner;
class kthFact{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		System.out.println("Enter a kth Vale");
		int k=sc.nextInt();
		System.out.println(kthFact(num,k));
	}
	public static int kthFact(int num,int k){
		int cnt=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				cnt++;
			}
			if(cnt==k){
				return i;
			}
		}
		return -1;
	}
}