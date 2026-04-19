// PrimitivesVsWrappers.java - complete all-in-one demo
import java.util.*;

public class AllinOnePrimitiveVsWrapper {

    // --1. FIELD LEVEL ------------------------------
    // Static -> lives in MetaSpace (shared, one copy)

    static int totalObjects = 0; // primitive static
    static Integer lastId = null; // wrapper static (nullable!)

    // --- 2. ALL 8 PAIRS - declared as local vars in main --------------

    public static void main(String[] args) {

        // Stack : raw value stored directly
        int     primitiveInt     = 2;
        long    primitiveLong    = 8L;
        double  primitiveDouble  = 3.4;
        float   primitiveFloat   = 5.6f;
        boolean primitiveBoolean = true;
        char    primitiveChar    = 'A';
        short   primitiveShort   = 15;
        byte    primitiveByte    = 0;

        // Heap: Object allocated, only reference on stack
        Integer   wrapperInt      = 2;
        Long      wrapperLong     = 8L;
        Double    wrapperDouble   = 3.4;
        Float     wrapperFloat    = 5.6f;
        Boolean   wrapperBoolean  = true;
        Character wrapperChar     = 'A';
        Short     wrapperShort    = 15;
        Byte      wrapperByte     = 0;

        // --3. Autoboxing / unboxing ----------
        Integer boxed = primitiveInt; // box: int -> Integer
        int  unboxed = wrapperInt; // unbox: Integer -> int
        int  sum = wrapperInt + unboxed; //unbox both, add, result is int

        // --4. Integer Cache (-128 to 127) ----------
        Integer a = 100, b = 100;
        System.out.println("100 == 100 (==) : " + (a == b)); // true (cached)

        Integer c = 200, d = 200;
        System.out.println("200 == 200 (==) : " + (c == d)); //false (new Obj!)
        System.out.println("200 == 200 (.equals) : " + c.equals(d)); // true (correct)

        // --5. NULL -Only possible with wrapper ----------
        Integer maybeAge = null;  // vaild = "not set"

        // int age = null;    // compile error

        System.out.println("age is null: " + (maybeAge == null)); //true

        //----------6. Wrapper Utility Methods -------------
        System.out.println("parseInt   : " + Integer.parseInt("42"));
        System.out.println("toBinary   : " + Integer.toBinaryString(255));
        System.out.println("MAX_VALUE  : " + Integer.MAX_VALUE);
        System.out.println("isDigit('9'): " + Character.isDigit('9'));
        System.out.println("isUpper('A'): " + Character.isUpperCase('A'));

        // -----7. Generic - primitives not allowed -----------
        // List<int> list = new ArrayList<>(); // compile error
        List<Integer> scores = new ArrayList<>();
        scores.add(95); scores.add(72); scores.add(88);
        Collections.sort(scores);
        System.out.println("sorted    : " + scores);

        // -- 8. Performance - Avoid wrapper in tight loops ----------------

        long start = System.nanoTime();
        long primSum = 0;
        for (long i = 0; i < 1_000_000; i++) primSum += i; //fast
        long primMs = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        Long wrapSum = 0L;
        for (long i = 0; i < 1_000_000; i++) wrapSum += i;  //GC pressure
        long wrapMs = (System.nanoTime() - start) / 1_000_000;

        System.out.println("Prim loop ms: " + primMs);
        System.out.println("wrap loop ms: " + wrapMs + " (Slower due to boxing)");
    }
}