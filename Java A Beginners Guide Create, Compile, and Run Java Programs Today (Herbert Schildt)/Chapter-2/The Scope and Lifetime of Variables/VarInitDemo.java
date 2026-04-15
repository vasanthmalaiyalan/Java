class VarInitDemo {
    public static void main(String[] args) {

        int x;

        for(x = 0; x < 3; x++) {

            int y = -1;

            System.out.println("y is: " + y);

            y = 100; // didn't use int 

            System.out.println("y is: " + y);
        }
    }
}