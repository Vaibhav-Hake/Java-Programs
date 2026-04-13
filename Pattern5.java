class Pattern5{
	public static void main(String[]args){
		int num=1;
		int n=5;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(j<n-1-i){
					System.out.print(" "+" ");
				}else{
					System.out.print(num+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}