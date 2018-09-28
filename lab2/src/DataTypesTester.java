/**
 * This class was created for education purpose.
 *
 * @author Vlad Koroktevich
 * @author Evgeniy Filippovich
 * @version 1.0
 * @date 28.09.2018
 */

public class DataTypesTester {

    /**
     * Testing operations with double data type.
     *
     * @author Vlad Korotkevich
     * @version 1.0
     */
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
        System.out.printf("%.1f = %.1f %%.1f\n", c, a, b);

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
        System.out.printf("%.1f %= %.1f --> c = %.1f \n", c, a ,c %= a);
        /*ERROR WITH BITWISE OPERATIONS*/

        c = 0;

        System.out.println("\n**********ASSIGNMENT OPERATIONS***********");
        System.out.printf("%.1f > %.1f --> %b \n", c, a, c > a);
    }

    public void testChar() {

    }

    public void testShort() {

    }

    public void testByte() {

    }
}
