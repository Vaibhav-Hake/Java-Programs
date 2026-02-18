class Print{
	public static void main (String []args)throws InterruptedException{
		System.out.println();
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
			Thread.sleep(2000);
		}
		System.out.println();
	}
}