class InchToMeter {
    public static void main(String[] args) {
        int counter = 0;

        for(int inch = 1; inch <= 144; inch++) {
            double meter = inch / 39.37;

         System.out.println(inch + " inches = " + meter + " meters");
         
         counter++;

         if(counter == 12) {
            System.out.println();
            counter = 0;
         }
        }
    }
}