class StrongNumber{
	public static int factorial(int num){
		return num==0?1:num*factorial(num-1);
	}
	public static int sumOfDigit(int num,int sum){
		return num==0?sum:sumOfDigit(num/10,sum+factorial(num%10));
	}
	public static boolean isStrong(int num){
		return num==sumOfDigit(num,0);
	}
	public static void main(String[]args){
		System.out.println(isStrong(145));
	}
}