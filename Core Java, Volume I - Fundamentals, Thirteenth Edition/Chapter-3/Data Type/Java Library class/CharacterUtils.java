public final class CharacterUtils {
    private CharacterUtils() {}

    // ======= CONSTANTS ==========
    private static final int MIN_SUPPLEMENTARY_CODE_POINT = 0x10000;
    private static final int MAX_CODE_POINT = 0x10FFFF;

    private static final int MIN_HIGH_SURROGATE = 0xD800;
    private static final int MIN_LOW_SURROGATE = 0xDC00;

    // ===== VALIDATION ============
    public static boolean isValidCodePoint(int codePoint) {
        return codePoint >= 0 && codePoint <= MAX_CODE_POINT;
    }

    // ====== MAIN METHOD: toChars ===========
    public static char[] toChars(int codePoint) {
        if (!isValidCodePoint(codePoint)) {
            throw new IllegalArgumentException("Invaild Unicode code point: " + codePoint);
        }

        if (codePoint < MIN_SUPPLEMENTARY_CODE_POINT) {

            // BMP (Basic Multilingual Plane)
            return new char[] {
                (char) codePoint
            };
        }

        // Supplementary character (needs surrogate pair)
        int cp = codePoint - MIN_SUPPLEMENTARY_CODE_POINT;

        char high = (char) ((cp >> 10) + MIN_HIGH_SURROGATE);
        char low = (char) ((cp & 0x3FF) + MIN_LOW_SURROGATE);

        return new char[] { high, low };
    }

    // ===== MAIN METHOD: to String ============
    public static String toString(int codePoint) {
        return new String(toChars(codePoint));
    }
}