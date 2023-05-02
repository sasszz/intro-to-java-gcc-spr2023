import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // SURROGATE PAIRS
        // 65536 -> UNICODE
        // High Surrogate (D800) and Low Surrogate (DC00)
        // 65536 -> Hex = 0x10000
        // Hex -> UTF-16
            // Subtract 0x10000 from the Hex Value
            // 0x10000 - 0x10000 = 0
            // For the high surrogate, shift right by 10, then add 0xD800, resulting in 0 + 0xD800
            // For the low surrogate, take the low 10 bits, then add 0xDC00, resulting in 0xDC00
            // https://en.wikipedia.org/wiki/UTF-16#U+D800_to_U+DFFF
        String test = "\uD800\uDC00";
        System.out.println(test);

        // 2 ^ 16 = 65536
        int test2 = 65536;
        System.out.println(Character.toChars(test2));

        int a = 1;
        double b = 2;
        System.out.println(a / b);

        int x = 6 + 3 - 4 + 6 * 3;
        System.out.println(x);



    }
}