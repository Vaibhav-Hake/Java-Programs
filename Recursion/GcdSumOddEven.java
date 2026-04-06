import java.util.Scanner;
class GcdSumOddSumEven{
	
	// fully optimized 
	public static int gcd(int n){
		return n;
	}
	public static void main(String[]args){
		System.out.println(gcd(5));
	}
	
	
	// optimize not till
	/* public int gcdOfOddEvenSums(int n) {
        //return n;
         int sumOdd=n*n;
         int sumEven=n*(n+1);
        
         return gcd(sumEven,sumOdd);
    }
     public int gcd(int a,int b){
         int small=a<b?a:b;
         while(small>0){
             if(a%small==0 && b%small==0){
                 break;
             }
             small--;
         }
         return small;

     }*/
}+