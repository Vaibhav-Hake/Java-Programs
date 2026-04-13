class Pattern9{
	public static void main(String[]args){
		pascal(6);
	}
	public static void pascal(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<num-1-i;j++){
				System.out.print(" "+" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(nCr(i,j)+"   ");
			}
			System.out.println();
		}
	}
	public static int nCr(int i,int j){
		return fact(i)/(fact(i-j)*fact(j));
	}
	public static int fact(int num){
		int fact=1;
		while(num>1){
			fact*=num;
			num--;
		}
		return fact;
	}
}