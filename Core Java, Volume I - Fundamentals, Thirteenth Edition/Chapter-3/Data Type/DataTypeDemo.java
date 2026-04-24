public class DataTypeDemo {
    public static void main(String[] args) {
        // ========= Integer Types ==========
        int a = 100;
        long population = 8_000_000_000L
        byte small = 120;
        short medium = 30000; 

        System.out.println("Integer values:");
        System.out.println("int a = " + a);
        System.out.println("long population = " + population);
        System.out.println("byte small = " + small);
        System.out,println("byte medium = " + medium);

        //=========== Integer Formats ==========
        int hex = 0XCAFE;
        int binary = 0b1001;
        int readable = 1_000_000;

        System.out.println("\nInteger formates: ");
        System.out.println("Hex (0xCAFE) = " + hex);
        System.out.println("Binary (0b1001) = " + binary);
        System.out.println("Readable (1_000_000) = " + readable);

        // ========= INTEGER OVERFLOW ==========
        int max = 2147483647;
        System.out.println("\nOverflow example:");
        System.out.println("Before overflow: " + max);
        max = max + 1;
        System.out.println("After overflow: " + max);

        // ========= Flow point types ==========
        double price = 99.99;
        float pi = 3.14F;

        System.out.println("\nFloating-point values:");
        System.out.println("double price = " + price);
        System.out.println("float pi = " + pi);

        // ======SCIENTIFIC NOTATION ==========
        double result = 2.0 - 1.1;
        System.out.println("\nPrecision issue:");
        System.out.println("2.0 - 1.1 = " + result);

        // === SPECIAL VALUES =======
        double posInF = 1.0 / 0;
        double negInf = -1.0 / 0;
        double man = 0.0 / 0;

        System.out.println("\nSpecial values:");
        System.out.println("Positive Infinity = " + posInf);
        System.out.println("Negative Infinity = " + negInf);
        System.out.println("NaN = " + nan);

        // ===== NaN CHECK =======
        if (Double.isNaN(nan)) {
            System.out.println("na is not-a-Number");
        }    

    }
}