class WhileDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'a'; //'a' → 97, 'z' → 122

        while(ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}