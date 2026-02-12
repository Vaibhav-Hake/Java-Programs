import java.util.Scanner;
class Extract4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num=sc.nextInt();
		boolean found=false;
		while(num>0){
			int last=num%10;
			if(last==0){
				found=true;
				
				break;
			}
			num/=10;
		}
		if(found){
			System.out.println("In that number 0 is Present");
		}
		else{
		System.out.println("In that number 0 is not Present");
		}
	}
}