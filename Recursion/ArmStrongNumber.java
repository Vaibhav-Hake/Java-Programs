class ArmStrongNumber{
	public static int cnt(int num,int cnt){
		return num==0?cnt:cnt(num/10,cnt+1);
	}
	public static int pow(int base,int raise){
		return raise==0? 1:base*pow(base,raise-1);
	}
	public static int sumOfDigit(int num,int temp,int sum){
		
		return num==0?sum:sumOfDigit(num/10,temp,sum+pow(num%10,cnt(temp,0)));
	}
	public static boolean isArmStrong(int num){
		return num==sumOfDigit(num,num,0);
	}
	public static void main(String[]args){
		System.out.println(isArmStrong(153));
	}
}