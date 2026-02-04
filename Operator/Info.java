import java.util.Scanner;
class Info{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Your Age: ");
		int age=sc.nextInt();
		System.out.print("Enter Your Gender:M/F ");
		char gender=sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Enter your College Name: ");
		String clg=sc.nextLine();
		System.out.print("Enter Your mob no: ");
		long mob=sc.nextLong();
		System.out.print("Enter yor cgpa: ");
		float cgpa=sc.nextFloat();
		System.out.print("Enter your 12 Yop");
		int tYop=sc.nextInt();
		System.out.print("Enter your degree Yop");
		int yop=sc.nextInt();
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("Gender :"+gender);
		System.out.println("ClgName: "+clg);
		System.out.println("mob: "+mob);
		System.out.println("cgpa :"+cgpa);
		System.out.println("12 th YOP: "+tYop);
		System.out.println("Degree YOP: "+yop);
		System.out.println("Thank You !!!");
	}
}