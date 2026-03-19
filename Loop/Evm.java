import java.util.Scanner;
class Evm{
	static int bjp,inc,aap,mns,ncp,nota;
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Population:");
		int population=sc.nextInt();
		for(int i=1;i<=population;i++){
			System.out.println("\n **** WELCOME****");
			System.out.println("1.NCP\n 2.BJP\n 3.INC\n 4.MNS\n 5.aap\n 6.NOTA");
			System.out.println("Enter Your Response:");
			String reso=sc.next().toLowerCase();
			if(reso.equals("bjp")){
		    	bjp++;
		    	System.out.println("YOU HAVE VOTED FOR BJP");
		    	System.out.println("ACCHE DIN AYENGE");
		    }
			else if (reso.equals("inc")){
		    	inc++;
		    	System.out.println("YOU HAVE VOTED FOR INC");
		    	System.out.println("BHARAT JODOO");
		    }
		    else if (reso.equals("aap")){
		    	aap++;
		    	System.out.println("YOU HAVE VOTED FOR AAP");
		    	System.out.println("AAP KA EK VOTE MUZE AZZAD KAREGA ");
		    }
		    else if (reso.equals("mns")){
		    	mns++;
		    	System.out.println("YOU HAVE VOTED FOR MNS");
		    	System.out.println("JAY MAHARASHTRA");
		    }
		    else if (reso.equals("ncp")){
		    	ncp++;
		    	System.out.println("YOU HAVE VOTED FOR NCP");
		    	System.out.println("KAMACHA MANUS FAKT GHADYAL");
		    }
		    else if (reso.equals("nota")){
		    	nota++;
		    	System.out.println("YOU HAVE VOTED FOR NOTA");
		    	System.out.println("CONGURATULATION YOU ARE WELL EDUCATED");
		    }
		    else {
		    	System.out.println("INVALID INPUT");
		        i--;
		 	}

}
  System.out.println("BJP"+bjp);
      System.out.println("INC"+inc);
      System.out.println("MNS"+mns);
      System.out.println("AAP"+aap);
      System.out.println("NCP"+ncp);
      System.out.println("NOTA"+nota);
     if (bjp>=inc && bjp>=mns && bjp>=aap && bjp>=ncp && bjp>=nota){
     	System.out.println("BJP has won the election");
     }
     else if (inc>=bjp && inc>=mns && inc>=aap && inc>=ncp && inc>=nota){
     	System.out.println("INC has won the election");
     }
     else if (mns>=inc && mns>=bjp && mns>=aap && mns>=ncp && mns>=nota){
     	System.out.println("MNS has won the election");
     }
     else if (aap>=inc && aap>=mns && aap>=bjp && aap>=ncp && aap>=nota){
     	System.out.println("AAP has won the election");
     }
     else if (ncp>=inc && ncp>=mns && ncp>=aap && ncp>=bjp && ncp>=nota){
     	System.out.println("ncp  has won the election");
     }
     else  
     {
     	System.out.println(" no one won ");
     }    
    }


		}
	
	
