class Pattern6{
	public static void main(String[]args){
		int n1=0,n2=1,ans=0;
		int n=5;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				if(j<n-1-i){
					System.out.print(" "+" ");
				}else{
					System.out.print(n1+" ");
					ans=n1+n2;
					n1=n2;
					n2=ans;
				}
			}
			System.out.println();
		}
	}
}