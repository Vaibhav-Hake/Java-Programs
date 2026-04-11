import java.util.Scanner;
class SolutionSumSq {
/*Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
Example 1:
Input: c = 5
Output: true
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:
Input: c = 3
Output: false*/
	
    public static boolean judgeSquareSum(int c) {
       long a=0;
       long b=0;
       while(b*b<c){
        b++;
       }
       while(a<=b){
         long sum=a*a+b*b;
        if(sum==c){
            return true;
        }else if(sum>c){
            b--;
        }else{
            a++;
        }
       }
       return false;
        
    }
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(judgeSquareSum(num));
	}
    
}