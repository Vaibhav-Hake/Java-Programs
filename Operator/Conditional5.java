class Conditional5{
	//Finding Largest no Among 3 no. Using Conditional Operator
	public static void main(String[]args){
		int n1=521;
		int n2=65563;
		int n3=64;
		int ans=n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
		//int ans=n1>n2&&n1>n3?n1:n2>n3?n2:n3;Using Logical And
		//int ans = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3 ? n2 : n3);//Optimize Solution

		System.out.println(ans);
	}  
}        