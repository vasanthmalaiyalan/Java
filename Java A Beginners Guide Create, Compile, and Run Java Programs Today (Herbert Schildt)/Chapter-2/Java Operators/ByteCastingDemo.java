class ByteCastingDemo {
    public static void main(String[] args) {

        int[] values = {127, 128, 130, 255, 256, 257};

        for (int i: values) {
            byte b = (byte) i;

            System.out.println("==============================");
            System.out.println("Original int : " + i);
            System.out.println("Binary (int) : " + toBinary32(i));
            System.out.println("After cast : " + b);
            System.out.println("Binary (byte): " + toBinary8(b));
        }
    }

    // 32-bits binary
    static String toBinary32(int n) {
        return String.format("%32s",Integer.toBinaryString(n)).replace(' ', '0');
    }

    static String toBinary8(byte n) {
        return String.format("%8s",Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
    }
}