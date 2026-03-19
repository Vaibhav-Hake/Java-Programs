import java.util.Scanner;
class CountFibbo{
       public static void main(String[]args){
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a Starting Number");
		   int start=sc.nextInt();
		   System.out.println("Enter a Ending Number");
		   int end=sc.nextInt();
		   int n1=0,n2=1,ans;
		   int cnt=0;
		   while(n1<=end){
			   ans=n1+n2;
			   if(n1>=start){
				  cnt++;
			   }
			   n1=n2;
			   n2=ans;
		   }
		   System.out.println("The count between "+start+" and "+end+" Fibonaccies Number is  "+cnt);
		   
	   } 	
}