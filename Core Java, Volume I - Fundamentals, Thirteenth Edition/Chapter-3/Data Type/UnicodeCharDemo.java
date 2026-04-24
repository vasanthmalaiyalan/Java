public class UnicodeCharDemo {
    public static void main(String[] args) {
        // ==== BASIC CHAR BPM =====
        char ch = 'A';
        System.out.println("Basic char: " + ch);

        // ==== UNICODE CODE POINT ======
        char unicode = '\u0041'; // 'A'
        System.out.println("Unicode \\u0041: " + unicode);

         // ======== STRING WITH NORMAL CHAR =======
         String text = "Hello";
         System.out.println("\nString: " + text);
         System.out.println("Length: " + text.length());

         // ===== EMOJI (SUPPLEMENTARY CHARACTER) =======
         String emoji = "😊"; // U+1F60A
         System.out.println("\nEmoji: " + emoji);
         System.out.println("Length of emoji string: " + emoji.length());

         // ==== CHAR COUNT VS CODE POINT COUNT =======
         System.out.println("Code point count: " + emoji.codePointCount(0, emoji.length()));

         // ======= MULTIPLE UNICODE SYMBOL ========
         String flag = "🇮🇳"; // India flag
         System.out.println("\nFlag: " + flag);
         System.out.println("Length: " + flag.length());
         System.out.println("Code points: " + flag.codePointCount(0, flag.length()));

         // ===== ITERATE CODE POINTS =======
         System.out.println("\nImportant:");
         System.out.println("A single symbol may use multiple char values!");
    }
}