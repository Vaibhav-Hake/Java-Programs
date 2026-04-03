class SpyNumber{
	public static int sumOfDigit(int num,int sum){
		return num==0?sum:sumOfDigit(num/10,sum+num%10);
		
	}
	public static int proOfDigit(int num,int pro){
		return num==0?pro:proOfDigit(num/10,pro*num%10);
		
	}
	public static boolean isSpy(int num){
		return sumOfDigit(num,0)==proOfDigit(num,1);
		
	}
	public static void main(String[]args){
		System.out.println(isSpy(1234));
	}
}