class ProOfDigit{
	public static int proOfDigit(int num,int pro){
		return num==0?pro:proOfDigit(num/10,pro*num%10);
		
	}
	public static void main(String[]args){
		System.out.println(proOfDigit(123,1));
	}
}