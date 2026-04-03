import java.util.Scanner;
class Power{
	public static int pow(int base,int raise){
		if(raise==0){
			return 1;
			
		}
		return base* pow(base,raise-1);
		
		//return raise==0?return 1:base* pow(base,raise-1);
	}
	public static void main(String[] args){
		System.out.println(pow(2,3));
	}
}