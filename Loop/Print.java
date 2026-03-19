class Print{
	public static void main (String []args)throws InterruptedException{
		System.out.println();
		int duration=200;
		int cnt=0;
		for(char ch='A';ch<='Z';ch++){
			System.out.print(ch);
			duration+=100;
			cnt++;
			if(cnt%6==0)duration=100;
			
			Thread.sleep(duration);
		 }
		System.out.println();
	}
}