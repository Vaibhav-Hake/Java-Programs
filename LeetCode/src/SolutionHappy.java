import java.util.Scanner;
class SolutionHappy {
	
    public static boolean isHappy(int n) {
        int sum=sumSq(n);
        while(sum!=1&&sum!=4){
            sum=sumSq(sum);
        }
        return sum==1;
        
    }
    public static int sumSq(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=(last*last);
            n/=10;
        }
        return sum;
    }
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(isHappy(num)){
			System.out.println("Happy Number");
		}else{
			System.out.println("Not Happy");
		}
	}
}