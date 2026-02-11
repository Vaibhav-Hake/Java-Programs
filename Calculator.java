import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter a Number 2:");
		int num2=sc.nextInt();
		System.out.println("Enter a Opeartor");
		char op=sc.next().charAt(0);   
		solve(num1,num2,op);
		
	}
	public static void solve(int num1,int num2,char op){
		int res=0;
		switch(op){
			case '+':{
				res=num1+num2;
				break;
			}
			case '-':{
				res=num1-num2;
				break;
			}
			case '*':{
				res=num1*num2;
				break;
			}
			case '/':{
				res=num1/num2;
				break;
			}
			case '%':{
				res=num1%num2;
				break;
			}
			default:{
				System.out.println("Invalid Operator");
				break;
			}
		}
	System.out.println(num1+" "+op+" "+num2+" = "+res);
	}
}