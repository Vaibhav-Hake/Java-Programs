class Test4 {
    static int a = 5;

    public static void main(String[] args) {
        change(a);
        System.out.println(a);
    }

   public static void change(int a) {
        a = a + 10;
    }
}