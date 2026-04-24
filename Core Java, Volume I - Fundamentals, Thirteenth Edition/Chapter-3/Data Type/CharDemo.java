public class CharDemo {
    public static void main(String[] args) {
        // ===== Basic CHAR =========
        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println("Basic Char:");
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        // ========= CHAR AS NUMBER ===========
        System.out.println("\nChar as number (unicode value):");
        System.out.println("Value of 'A' = " + (int) ch1 );

        // ====== UNICODE CHAR ==========
        char unicodeChar = '\u0041'; // 'A'
        System.out.println("Unicode char:");
        System.out.println("Unicode \\u0041 = " + unicodeChar);

        // ======= ESCAPE SEQUENCES ==========
        System.out.println("\nEscape sequences:");
        System.out.println("New line:\nHello\nWorld");
        System.out.println("Tab:\tJava");
        System.out.println("Backslash: \\ ");
        System.out.println("Single quote: \' ");
        System.out.println("Double quote: \" ");

        // ==== STRING VS CHAR ========
        char singleChar = 'x';
        String str = "X";

        System.out.println("\nChar vs String:");
        System.out.println("char = " + singleChar);
        System.out.println("String = " + str);

        // ==== MULTIPLE CHAR (IMPORTANT) =====
        char tamil = 'அ'; // Unicode Tamil character
        System.out.println("\nUnicode (Tamil): " + tamil);

        // ===== EMOJI PROBLEM (ADVANCED) ======
        System.out.println("\nEmoji example:");
        String emoji = "😊";
        System.out.println("Emoji = " + emoji);
        System.out.println("Length of emoji string = " + emoji.length());
    }
}