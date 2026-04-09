class SolutionFib {
    public static int fib(int n) {
        int n1=0;
        int n2=1;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        return n1;
        
    }
	public static void main(String[]args){
		System.out.println(fib(2));
	}
}