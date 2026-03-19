import java .util.*;
class demo5{
	public static void main(String []args){
		ArrayList<String> transaction=new ArrayList<String>();
		transaction.add("Deposite:2022");
		transaction.add("Withdeaw:664");
		transaction.add("Withdeaw:664");
		transaction.add("Withdeaw:664");
		transaction.add("Deposite:2022");
		transaction.add("Deposite:2022");
		transaction.add("Withdeaw:664");
		for(String ele:transaction){
		    System.out.println(ele);	
		}
	}
}