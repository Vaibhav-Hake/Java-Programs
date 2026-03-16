
class Pattern39{
	public static void main(String[]args){
	
		int n=4,evenDiff=7,oddDiff=-2;
		for(int i=1;i<=n;i++){
			int temp=i;
			for(int j=1;j<=i;j++){
				System.out.print(temp+" ");
				temp=j%2!=0 ? temp+evenDiff: temp+oddDiff;
			}
			System.out.println();
			evenDiff-=2;
			oddDiff+=2;
		}

		
	}
}