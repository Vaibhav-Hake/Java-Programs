import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
class Bank{
	static String name, address, pancard;
	static long contact,adhar;
	static int pin;
	static double balance;
	static ArrayList< String>transiction=new ArrayList<String>();
	static LocalDateTime a;
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		WelcomeLoop:
		for(;;){
			System.out.println("WELCOME");
			System.out.println("***Vaibhav Chit Fund");
			System.out.println("1.Create Account \n 2.Login");
			System.out.println("Enter Your Responce");
			int res=sc.nextInt();
			switch(res){
				case 1:{
					if(name!=null){
						System.out.println("\n Account Alredy Exit!");
						continue;
					}
					System.out.println("\n Account creation page");
    			    System.out.print("Name: ");
    			    name = new Scanner(System.in).nextLine();
    			    System.out.print(" Address: ");
    			    address= new Scanner(System.in).nextLine();
    			    System.out.print(" Addhar: ");
    			    adhar = new Scanner(System.in).nextLong();
    			    System.out.print(" pancard: ");
    			    pancard= new Scanner(System.in).next();
    			    System.out.print(" contact: ");
    			    contact = new Scanner(System.in).nextLong();
    			    System.out.print(" PIN: ");
    			    pin= new Scanner(System.in).nextInt();
    			    System.out.print(" Balance:");
    			    balance = new Scanner(System.in).nextDouble();
					a=LocalDateTime.now();
					transiction.add("DEPOSITE(CREATION) : "+balance+" Rs. "+(a.getHour())/12+":"+a.getMinute()+":"+a.getSecond());
    			    System.out.println("Your account has been created");
    			    break;
				}
				case 2:{
					if(name==null){
					System.out.println("\n creat your account first");
					continue;
				}
				    System.out.println("\n Login page");
				    System.out.print(" Contact");
				    long usrecontact=new Scanner(System.in).nextLong();
				    System.out.print(" pin");
				    int pin2=new Scanner(System.in).nextInt();
					if(usrecontact==contact&&pin2==pin){
						System.out.println("login sussesful");
					    features :
					    for( ; ; ){
					        System.out.println("\n***** features *****");
					        System.out.println("1.Deposit\n 2.widthdraw\n 3.Chake balance \n 4.transiction\n 5.logout");
					        System.out.println("Enter your option");
					        int opt=sc.nextInt();
							switch (opt){
					            case 1:{
						            System.out.println("DEPOSIT MODULE");
						            System.out.println("Enter your deposit amount");
						            double depositamount=new Scanner(System.in).nextDouble();
						            balance += depositamount;
									a=LocalDateTime.now();
					transiction.add("DEPOSITE : "+depositamount+" Rs. "+(a.getHour())/12+":"+a.getMinute()+":"+a.getSecond());
						            System.out.println("Ammount has been cridited");
						            break ;
					                }
                                case 2:{

                     	           System.out.println("Withdraw module");
						           System.out.println("Enter your withdraw amount");
						           double withdrawamount=new Scanner(System.in).nextDouble();
                                    System.out.println("Enter your PIN");
						            int pin3=new Scanner(System.in).nextInt();						          
								  if(pin3==pin){
						               
							            if(withdrawamount<=balance){
								        balance-=withdrawamount;
										a=LocalDateTime.now();
					transiction.add("WithDraw : "+withdrawamount+" Rs. "+(a.getHour())/12+":"+a.getMinute()+":"+a.getSecond());
								        System.out.println(" Ammount has been debited");
							                }
							            else {
								        System.out.println("INDUFICENT FUND");
							                }
								   }
								   
						            else {
							            System.out.println("Wrong pin ");
						                }
								    break;
								}
										
								   
					            case 3:{
					 	            System.out.println("CHAKE BALANCE");
						            System.out.println("Enter your PIN");
						            int pin4=new Scanner(System.in).nextInt();
							        if(pin4==pin){
								        System.out.println(" Balance" +balance);
							        }
							        else {
								        System.out.println("Wrong pin");
							        }
							        break ;
					            }	
					            case 4:{
						            System.out.println("\n******transiction******\n");
						            for (String ele:transiction){
							            System.out.println(ele);
							           
						            }
									 break ;
					            }
					            case 5:{
						            System.out.println("thank you wisit again ");
						            continue WelcomeLoop;
					            }

						    }
                        }
				    }
		
			
		
					else{
						System.out.println("invalid contact or Password");
					}
					break;
				}
			
			}
		}
	}
}

	
