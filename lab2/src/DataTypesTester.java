/**
 * This class was created for education purpose.
 *
 * @author Vlad Koroktevich
 * @author Evgeniy Filippovich
 * @version 1.0
 * @date 28.09.2018
 */

public class DataTypesTester {

    public static void testDouble() {
        double a = 2, b = 4;

        System.out.println("**********ARITHMETIC OPERATIONS**********");

        double c;

        // addition
        c = a + b;
        System.out.printf("%.1f = %.1f + %.1f\n", c, a, b);
        // subtraction
        c = a - b;
        System.out.printf("%.1f = %.1f - %.1f\n", c, a, b);
        // multiply
        c = a * b;
        System.out.printf("%.1f = %.1f * %.1f\n", c, a, b);
        //division
        a = 0;
        b = 0;
        c = a / b;
        System.out.printf("%.1f = %.1f / %.1f\n", c, a, b);
        a = 1;
        c = a / b;
        System.out.printf("%.1f = %.1f / %.1f\n", c, a, b);
        // module
        c = a % b;
        System.out.printf("%.1f = %.1f %% %.1f\n", c, a, b);

        a = 2;
        b = 3;

        //unary minus
        c = -a;
        System.out.printf("%.1f = -%.1f\n", c, a);
        // unary plus
        c = +a;
        System.out.printf("%.1f = +%.1f\n", c, a);
        // prefix increment
        System.out.printf("%.1f = %.1f\n", a, ++a);
        a = 2;
        // postfix increment
        System.out.printf("%.1f = %.1f\n", a, a++);
        a = 2;
        // prefix decrement
        System.out.printf("%.1f = %.1f\n", a, --a);
        a = 2;
        // postfix decrement
        System.out.printf("%.1f = %.1f\n", a, a--);
        a = 2;

        System.out.println("\n**********BITWISE OPERATIONS**********");

        /*
        bitwise AND
        c = a & b;
        bitwise OR
        c = a | b;
        bitwise XOR
        c = a ^ b;
        bitwise NOT
        c = ~a;
        left shift
        c = a << 1;
        right shift
        c = a >> 1;
        unsigned left shift
        c = a <<< 1;
        unsigned right shift
        c = a >>> 1;
        -> causes compilation ERROR
        */

        System.out.println("\n**********ASSIGNMENT OPERATIONS**********");
        System.out.printf("%.1f += %.1f --> c = %.1f \n", c, a ,c += a);
        System.out.printf("%.1f -= %.1f --> c = %.1f \n", c, a ,c -= a);
        System.out.printf("%.1f /= %.1f --> c = %.1f \n", c, a ,c /= a);
        System.out.printf("%.1f *= %.1f --> c = %.1f \n", c, a ,c *= a);
        System.out.printf("%.1f %%= %.1f --> c = %.1f \n", c, a ,c %= a);
        /*ERROR WITH BITWISE OPERATIONS*/

        c = 0;

        System.out.println("\n**********ASSIGNMENT OPERATIONS***********");
        System.out.printf("%.1f > %.1f --> %b \n", c, a, c > a);
        System.out.printf("%.1f < %.1f --> %b \n", c, a, c < a);
        System.out.printf("%.1f >= %.1f --> %b \n", c, a, c >= a);
        System.out.printf("%.1f <= %.1f --> %b \n", c, a, c <= a);
        System.out.printf("%.1f == %.1f --> %b \n", c, a, c == a);
        System.out.printf("%.1f != %.1f --> %b \n", c, a, c != a);

        System.out.println("\n**********LOGICAL OPERATIONS***********");
        System.out.printf("(%.1f > %.1f) && (%.1f > 0) --> %b\n", a,b,a, (a > b) && (a > 0));
        System.out.printf("(%.1f > %.1f) & (%.1f > 0) --> %b\n", a,b,a, (a > b) & (a > 0));
        System.out.printf("(%.1f >= %.1f) || (%.1f != 0) --> %b\n", a,b,a, (a >= b) || (b != 0));
        System.out.printf("(%.1f >= %.1f) | (%.1f != 0) --> %b\n", a,b,a, (a >= b) | (b != 0));
        System.out.printf("(%.1f >= %.1f) ^ (%.1f != 0) --> %b\n", a,b,a, (a >= b) ^ (b != 0));
        System.out.printf("!(%.1f >= %.1f) --> %b\n", a, b, !(a >= b));

        System.out.println("\nTYPE CAST OPERATOR:");

        byte bt = 127;
        short sh = 31999;
        char ch = 12;
        int i = 5678;
        long l = 1000000000L;
        float f = 1.34f;

        double c1 = c;
        c = bt;
        System.out.printf("double = byte: c = %.1f --> c = %s\n", c1, c);
        c = sh;
        System.out.printf("double = short : c = %.1f --> c = %s\n", c1, c);
        c = ch;
        System.out.printf("double = char : c = %.1f --> c = %s\n", c1, c);
        c = i;
        System.out.printf("double = int : c = %.1f --> c = %s\n", c1, c);
        c = l;
        System.out.printf("double = long : c = %.1f --> c = %s\n", c1, c);
        c = f;
        System.out.printf("double = float : c = %.1f --> c = %s\n", c1, c);
    }

    public static void testChar() {
        char a = 65, b = 67;

        System.out.println("**********ARITHMETIC OPERATIONS**********");

        char c;

        // addition
        c = (char)(a + b);
        System.out.printf("%s = %s + %s\n", c, a, b);
        // subtraction
        c = (char)(a - b);
        System.out.printf("%s = %s - %s\n", c, a, b);
        // multiply
        c = (char)(a * b);
        System.out.printf("%s = %s * %s\n", c, a, b);
        //division
        a = 65;
        b = 67;
        c = (char)(a / b);
        System.out.printf("%s = %s / %s\n", c, a, b);
        a = 65;
        c = (char)(a / b);
        System.out.printf("%s = %s / %s\n", c, a, b);
        // module
        c = (char)(a % b);
        System.out.printf("%s = %s %% %s\n", c, a, b);

        a =65;
        b = 67;

        //unary minus
        c = (char)(-a);
        System.out.printf("%s = -%s\n", c, a);
        // unary plus
        c = (char)(+a);
        System.out.printf("%s = +%s\n", c, a);
        // prefix increment
        System.out.printf("%s = %s\n", a, ++a);
        a = 65;
        // postfix increment
        System.out.printf("%s = %s\n", a, a++);
        a = 65;
        // prefix decrement
        System.out.printf("%s = %s\n", a, --a);
        a = 65;
        // postfix decrement
        System.out.printf("%s = %s\n", a, a--);
        a = 65;

        System.out.println("\n**********BITWISE OPERATIONS**********");


        //bitwise AND
        c = (char)(a & b);
        System.out.printf("%s = %s & %s\n", c, a, b);
        //bitwise OR
        c = (char)(a | b);
        System.out.printf("%s = %s | %s\n", c, a, b);
        //bitwise XOR
        c = (char)(a ^ b);
        System.out.printf("%s = %s ^ %s\n", c, a, b);
        //bitwise NOT
        c = (char)(~a);
        System.out.printf("%s = ~%s \n", c, a);
        //left shift
        c = (char)(a << 1);
        System.out.printf("%s = %s << %s\n", c, a, b);
        //right shift
        c = (char)(a >> 1);
        System.out.printf("%s = %s >> %s\n", c, a, b);
        //unsigned right shift
        c = (char)(a >>> 1);
        System.out.printf("%s = %s >>> %s\n", c, a, b);


        System.out.println("\n**********ASSIGNMENT OPERATIONS**********");
        System.out.printf("%s += %s --> c = %s \n", c, a ,c += a);
        System.out.printf("%s -= %s --> c = %s \n", c, a ,c -= a);
        System.out.printf("%s /= %s --> c = %s \n", c, a ,c /= a);
        System.out.printf("%s *= %s --> c = %s \n", c, a ,c *= a);
        System.out.printf("%s %%= %s --> c = %s \n", c, a ,c %= a);

        System.out.printf("%s &= %s --> c = %s \n", c, a ,c &= a);
        System.out.printf("%s |= %s --> c = %s \n", c, a ,c |= a);
        System.out.printf("%s ^= %s --> c = %s \n", c, a ,c ^= a);
        System.out.printf("%s >>= 1 --> c = %s \n", c, c >>= 1);
        System.out.printf("%s <<= 1 --> c = %s \n", c, c <<= 1);
        System.out.printf("%s >>>= 1 --> c = %s \n", c, c >>>= 1);

        System.out.println();

        c = 1;

        System.out.println("\n**********ASSIGNMENT OPERATIONS***********");
        System.out.printf("%s > %s --> %b \n", c, a, c > a);
        System.out.printf("%s < %s --> %b \n", c, a, c < a);
        System.out.printf("%s >= %s --> %b \n", c, a, c >= a);
        System.out.printf("%s <= %s --> %b \n", c, a, c <= a);
        System.out.printf("%s == %s --> %b \n", c, a, c == a);
        System.out.printf("%s != %s --> %b \n", c, a, c != a);

        System.out.println("\n**********LOGICAL OPERATIONS***********");
        System.out.printf("(%s > %s) && (%s > 0) --> %b\n", a,b,a, (a > b) && (a > 0));
        System.out.printf("(%s > %s) & (%s > 0) --> %b\n", a,b,a, (a > b) & (a > 0));
        System.out.printf("(%s >= %s) || (%s != 0) --> %b\n", a,b,a, (a >= b) || (b != 0));
        System.out.printf("(%s >= %s) | (%s != 0) --> %b\n", a,b,a, (a >= b) | (b != 0));
        System.out.printf("(%s >= %s) ^ (%s != 0) --> %b\n", a,b,a, (a >= b) ^ (b != 0));
        System.out.printf("!(%s >= %s) --> %b\n", a, b, !(a >= b));

        System.out.println("\nTYPE CAST OPERATOR:");

        byte bt = 66;
        short sh = 244;

        char c1 = c;
        c = (char)bt;
        System.out.printf("char = byte: c = %s --> c = %s\n", c1, c);
        c = (char)sh;
        System.out.printf("char = byte: c = %s --> c = %s\n", c, sh);
    }

    public static void testFloat() {
        float a = 2f, b = 4f;

        System.out.println("**********ARITHMETIC OPERATIONS**********");

        float c;

        // addition
        c = (float)(a + b);
        System.out.printf("%.1f = %.1f + %.1f\n", c, a, b);
        // subtraction
        c = (float)(a - b);
        System.out.printf("%.1f = %.1f - %.1f\n", c, a, b);
        // multiply
        c = (float)(a * b);
        System.out.printf("%.1f = %.1f * %.1f\n", c, a, b);
        //division
        a = 0f;
        b = 0f;
        c = a / b;
        System.out.printf("%.1f = %.1f / %.1f\n", c, a, b);
        a = 1f;
        c = (float)(a / b);
        System.out.printf("%.1f = %.1f / %.1f\n", c, a, b);
        // module
        c = (float)(a % b);
        System.out.printf("%.1f = %.1f %% %.1f\n", c, a, b);

        a = 2f;
        b = 3f;

        //unary minus
        c = -a;
        System.out.printf("%.1f = -%.1f\n", c, a);
        // unary plus
        c = +a;
        System.out.printf("%.1f = +%.1f\n", c, a);
        // prefix increment
        System.out.printf("%.1f = %.1f\n", a, ++a);
        a = 2f;
        // postfix increment
        System.out.printf("%.1f = %.1f\n", a, a++);
        a = 2f;
        // prefix decrement
        System.out.printf("%.1f = %.1f\n", a, --a);
        a = 2f;
        // postfix decrement
        System.out.printf("%.1f = %.1f\n", a, a--);
        a = 2f;

        System.out.println("\n**********BITWISE OPERATIONS**********");

        /*
        bitwise AND
        c = a & b;
        bitwise OR
        c = a | b;
        bitwise XOR
        c = a ^ b;
        bitwise NOT
        c = ~a;
        left shift
        c = a << 1;
        right shift
        c = a >> 1;
        unsigned left shift
        c = a <<< 1;
        unsigned right shift
        c = a >>> 1;
        -> causes compilation ERROR
        */

        System.out.println("\n**********ASSIGNMENT OPERATIONS**********");
        System.out.printf("%.1f += %.1f --> c = %.1f \n", c, a ,c += a);
        System.out.printf("%.1f -= %.1f --> c = %.1f \n", c, a ,c -= a);
        System.out.printf("%.1f /= %.1f --> c = %.1f \n", c, a ,c /= a);
        System.out.printf("%.1f *= %.1f --> c = %.1f \n", c, a ,c *= a);
        System.out.printf("%.1f %%= %.1f --> c = %.1f \n", c, a ,c %= a);
        /*ERROR WITH BITWISE OPERATIONS*/

        c = 0f;

        System.out.println("\n**********ASSIGNMENT OPERATIONS***********");
        System.out.printf("%.1f > %.1f --> %b \n", c, a, c > a);
        System.out.printf("%.1f < %.1f --> %b \n", c, a, c < a);
        System.out.printf("%.1f >= %.1f --> %b \n", c, a, c >= a);
        System.out.printf("%.1f <= %.1f --> %b \n", c, a, c <= a);
        System.out.printf("%.1f == %.1f --> %b \n", c, a, c == a);
        System.out.printf("%.1f != %.1f --> %b \n", c, a, c != a);

        System.out.println("\n**********LOGICAL OPERATIONS***********");
        System.out.printf("(%.1f > %.1f) && (%.1f > 0) --> %b\n", a,b,a, (a > b) && (a > 0));
        System.out.printf("(%.1f > %.1f) & (%.1f > 0) --> %b\n", a,b,a, (a > b) & (a > 0));
        System.out.printf("(%.1f >= %.1f) || (%.1f != 0) --> %b\n", a,b,a, (a >= b) || (b != 0));
        System.out.printf("(%.1f >= %.1f) | (%.1f != 0) --> %b\n", a,b,a, (a >= b) | (b != 0));
        System.out.printf("(%.1f >= %.1f) ^ (%.1f != 0) --> %b\n", a,b,a, (a >= b) ^ (b != 0));
        System.out.printf("!(%.1f >= %.1f) --> %b\n", a, b, !(a >= b));

        System.out.println("\nTYPE CAST OPERATOR:");
        byte bt = 127;
        short sh = 31999;
        char ch = 12;
        int i = 5678;
        long l = 1000000000L;

        float c1 = c;
        c = bt;
        System.out.printf("float = byte: c = %.1f --> c = %.1f\n", c1, c);
        c = sh;
        System.out.printf("float = short : c = %.1f --> c = %.1f\n", c1, c);
        c = ch;
        System.out.printf("float = char : c = %.1f --> c = %.1f\n", c1, c);
        c = i;
        System.out.printf("float = int : c = %.1f --> c = %.1f\n", c1, c);
        c = l;
        System.out.printf("float = long : c = %.1f --> c = %.1f\n", c1, c);
    }
}
