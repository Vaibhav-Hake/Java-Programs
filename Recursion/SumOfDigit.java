class SumOfDigit{
	public static int sumOfDigit(int num,int sum){
		return num==0?sum:sumOfDigit(num/10,sum+num%10);
		
	}
	public static void main(String[]args){
		System.out.println(sumOfDigit(12,0));
	}
}