class IfDemo {
    public static void main(String[]  args) {

        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");

        if(a == b) System.out.println("you won't see this");

        System.out.println(); //just black space

        c = a - b; // -1

        System.out.println("C contains -1");

        if(c >= 0) System.out.println("c is no-negative number");
        if(c < 0) System.out.println("c is negative");

        System.out.println();

        c = b - 1;

        System.out.println("c contains 1");

        if(c >= 0) System.out.println("c is non-negative");
        if(c < 0) System.out.println("c is negative");
    }
}

/*
a is less than b

C contains -1
c is negative

c contains 1
c is non-negative
*/