class LongInces {
    public static void main(String[] args) {

        long ci;
        long im;

        im = 5280 * 12; // mile -> inches
        ci = im * im * im; // cube

        System.out.println("There are " + ci + " Cubic inches mile.");
    }
}