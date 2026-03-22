import java.util.Scanner;
class RangeArmStrongNumber{
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
   public static void armStrong(int start,int end){
	   while(start<=end){
		   if(isArmStrong(start)){
			   System.out.println(start);
		   }
		   start++;
	   }
   }
   public static void main(String[]args){
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a starting Number Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number Number:");
		int end=sc.nextInt();
		armStrong(start,end);
   }
}