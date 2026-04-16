class InputChar {
    public static void main(String[] args) 
        throws java.io.IOException {

            char ch1, ch2;

            System.out.print("Press a key followed by Enter: ");

            ch1 = (char) System.in.read(); // get a char
            ch2 = (char) System.in.read(); //second

            System.out.println("Your key is: " + ch1);
            System.out.println("Your key is: " + ch2);
        }
    }
