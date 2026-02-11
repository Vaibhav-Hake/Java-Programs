class While3{
	public static void main(String[]args){
		char ch='A';
		while(ch<'Z'){
			System.out.println(ch+" "+(char)(ch+32));
			ch++;
		}
	}
}