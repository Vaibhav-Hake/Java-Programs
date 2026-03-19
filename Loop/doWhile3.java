class doWhile3{
	public static void main(String[]args){
		char ch='A';
		do{
			System.out.println(ch+" "+(char)(ch+32));
			ch++;
		}
		while(ch<'Z');
	}
}