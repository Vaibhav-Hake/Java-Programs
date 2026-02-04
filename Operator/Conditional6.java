class Conditional6{
	//Find Smallest No.among 3 no .using Conditional Operator
	public static void main(String[]args){
		int n1=524;
		int n2=56;
		int n3=6;
		int ans=n1<n2?n1<n3?n1:n3:n2<n3?n2:n3;
		System.out.println(ans);
	}
}