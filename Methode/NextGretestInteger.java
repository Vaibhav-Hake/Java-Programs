import java.util.Scanner;
class NextGretestInteger{
	public static void main(String[]args){
		System.out.println(nextGreater(1234));
	}
	 
	public static int nextGreater(int num){
		for(int i=num+1;i<power(num);i++){
			if(containAllDigits(num,i)){
				return i;
			}
		}
		return -1;
	}
	public static boolean containAllDigits(int n1,int n2){
		while(n2!=0){
			int val=removeDigit(n1,n2%10);
			if(val!=-1){
				n1=val;
				n2/=10;
			}
			else{
				break;
			}
		}
		return n1==0;
	}
	public static int power(int num){
		int pow=1;
		while(num!=0){
			pow*=10;
			num/=10;
		}
		return pow;
	}
	public static int removeDigit(int num,int digit){
		if(num>=0&&num<=9 && num==digit){
			return 0;
		}
		else{
			int newNum=0;
			while(num!=0){
				int last=num%10;
				if(last!=digit){
					newNum=newNum*10+last;
					num/=10;
				}
				else{
					
					if((num>=0&&num<=9)){
						newNum=newNum*1;
					}
					else{
						num/=10;
						newNum=newNum*power(num)+num;
						
					}
					break;
				}
			}
			return num!=0?newNum:-1;
		}
	}
	
}