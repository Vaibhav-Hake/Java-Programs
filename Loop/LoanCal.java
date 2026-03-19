import java .util.Scanner;
class LoanCal{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		for(;;)
		{
		System.out.println("\n **** WELCOME***\n");
	    System.out.println("Enter Ammount");
		double amount=sc.nextDouble();
		 if(amount<1000 || amount>100000){
			System.out.println("\n INVALID AMOUNT\n");
            continue;			
		 }
		System.out.println("Rate of Interst (p.m)");
		double interset=sc.nextDouble();
		if(interset<1 || interset>30){
			System.out.println("\n INVALID AMOUNT\n");
            continue;			
		 }
		 System.out.println("Loan Tensure(Month)");
		int tensure=sc.nextInt();
		if(tensure<3 || tensure>36){
			System.out.println("\n INVALID Tensure\n");
            continue;			
		 }
		 
		 double perMonthAmt=(amount/100)* interset;
		 double totalInterstAmount=perMonthAmt*tensure;
		 double emi=(amount+totalInterstAmount)/tensure;
		 double totalAmt=amount+totalInterstAmount;
		 System.out.println("Principle Amount:"+amount);
		 System.out.println("Monthly Emi:"+emi);
		 System.out.println("Total Interest:"+totalInterstAmount);
		 System.out.println("Total Amount:"+totalAmt);
		 
		}
	}
}