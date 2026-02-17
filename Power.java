import java.util.Scanner;
class Power{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Base value");
		int base=sc.nextInt();
		System.out.println("Enter Raise value:");
		int raise=sc.nextInt();
		int res=1;
		for(int i=0;i<raise;i++){
			res=res*base;
		}
		System.out.println("The power of "+base+"^"+raise +"is "+res);
	}
}