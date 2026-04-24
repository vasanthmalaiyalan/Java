public class TestUnicode {
    public static void main(String[] args) {
        int smileCode = 0x1F60A;

        char[] chars = CharacterUtils.toChars(smileCode);

        System.out.println("Char array length: " + chars.length);

        String emoji = CharacterUtils.toString(smileCode);

        System.out.println("Emoji: " + emoji);
    }
}