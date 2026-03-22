import java.util.Scanner;
class ArmStrongNumber{
	public static int cnt(int num){
		int cnt=0;
		while(num!=0){
			cnt++;
			num/=10;
		}
		return cnt;
	}
   public static int power(int num,int cnt){
	   int pow=1;
	   while(cnt>0){
		   pow*=num;
		   cnt--;
	   }
	   return pow;
   }
   public static int sum(int num){
	   int sum=0;
	   int cnt=cnt(num);
	   while(num!=0){
		   sum+=power(num%10,cnt);
		   num/=10;
	   }
	   return sum;
   }
   public static boolean isArmStrong(int num){
	   return sum(num)==num;
   }
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num=sc.nextInt();
	   if(isArmStrong(num)){
		   System.out.println("The Number is ArmStrong Number");
	   }else{
		   System.out.println("The number is Not ArmStrong Number");
	   }
   }
}