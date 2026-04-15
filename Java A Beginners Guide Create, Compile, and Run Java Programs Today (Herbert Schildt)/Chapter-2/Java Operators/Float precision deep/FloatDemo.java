class FloatDemo {
    public static void main(String[] args) {

        System.out.println("==== 1.Float Precision Issue ====");

        long big = 1234578912345L;
        float f = big; 

        System.out.println("Original long : " + big);
        System.out.println("Converted float: " + f);

        System.out.println("\n=== 2. Scientific Notation (Auto) ===");

        float num = 123000f;
        System.out.println("Normal print : " + num);
        System.out.printf("Scientific : %e\n", num);

        System.out.println("\n=== 3. Percision Loss Proof ===");

        float test = 123456789f;
        System.out.println("Exact number : 123456789");
        System.out.println("Stored float : " + test);
    }
}

/*
==== 1.Float Precision Issue ====
Original long : 1234578912345
Converted float: 1.23457896E12

=== 2. Scientific Notation (Auto) ===
Normal print : 123000.0
Scientific : 1.230000e+05

=== 3. Percision Loss Proof ===
Exact number : 123456789
Stored float : 1.23456792E8
 */