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
        public static void testInt(){
    	int a = 5, b = 2, c;
    
    	System.out.println("\n***** Arithmetical Operators *****");
    
    	c = a + b;
	    System.out.printf("%d + %d = %d\n", a, b, c);
    	c = a - b;
    	System.out.printf("%d - %d = %d\n", a, b, c);
    	c = a * b;
    	System.out.printf("%d * %d = %d\n", a, b, c);
    	c = a / b;
    	System.out.printf("%d / %d = %d\n", a, b, c);
    	c = a % b;
    	System.out.printf("%d %% %d = %d\n", a, b, c);
    	c = -a;
    	System.out.printf("-%d = %d\n", a, c);
    	c = +a;
    	System.out.printf("+%d = %d\n", a, c);
    	System.out.printf("++%d = %d\n", a, ++a);
    	a = 5;
    	System.out.printf("%d++ = %d\n", a, a++);
    	a = 5;
    	System.out.printf("--%d = %d\n", a, --a);
    	a = 5;
    	System.out.printf("%d-- = %d\n", a, a--);
    	a = 5;

    	System.out.println("\n***** Bitwise Operators *****");

    	c = a & b;
    	System.out.printf("%d & %d = %d\n", a, b, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(b), Integer.toBinaryString(c));
    	c = a | b;
    	System.out.printf("%d | %d = %d\n", a, b, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(b), Integer.toBinaryString(c));
    	c = a ^ b;
    	System.out.printf("%d ^ %d = %d\n", a, b, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(b), Integer.toBinaryString(c));
    	c = ~a;
    	System.out.printf("~%d = %d\n", a, c);
    	System.out.println("in binary form:");
    	System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));
    	c = a << 1;
    	System.out.printf("%d << 1 = %d\n", a, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));
    	c = a >> 1;
    	System.out.printf("%d >> 1 = %d\n", a, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));
    	a = -5;
    	c = a >> 1;
    	System.out.printf("%d >> 1 = %d\n", a, c);
    	System.out.println("in binary form:");
   		System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));
    	a = 5;
    	c = a >>> 1;
    	System.out.printf("%d >>> 1 = %d\n", a, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));
    	a = -5;
    	c = a >>> 1;
    	System.out.printf("%d >>> 1 = %d\n", a, c);
    	System.out.println("in binary form:");
    	System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
    	 Integer.toBinaryString(c));

    	System.out.println("\n***** Assignment Operators *****");

    	c = 7;
    	a = 5;
    	System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
    	System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
    	System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
    	System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
    	System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
    	System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
    	System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
   		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
    	System.out.printf("%d >>= %d --> c = %d\n", c, a, c >>= a);
    	System.out.printf("%d <<= %d --> c = %d\n", c, a, c <<= a);
    	System.out.printf("%d >>>= %d --> c = %d\n", c, a, c >>>= a);

    	System.out.println("\n***** Relational Operators *****");

    	System.out.printf("%d > %d --> %b\n", a, b, a > b);
    	System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
    	System.out.printf("%d < %d --> %b\n", a, b, a < b);
    	System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
    	System.out.printf("%d == %d --> %b\n", a, b, a == b);
    	System.out.printf("%d != %d --> %b\n", a, b, a != b);

    	System.out.println("\n***** Logical Operators *****");

    	//Logical AND
    	System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
    	 (a > b) && (a > 0));
   		//bitwise logical AND
    	System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
    	 (a > b) & (a > 0));
    	//Logical OR
    	System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, a,
    	 (a >= b) || (a != 0));
   		//bitwise logical OR
   		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, a,
    	 (a >= b) | (a != 0));
    	//Logical XOR
    	System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, a,
    	 (a >= b) ^ (a != 0));
    	//Logical NOT
    	System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

    	System.out.println("\n***** Misc Operators *****");

    	System.out.println("\nCondition Operator:");

    	System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
    	  (a > b ? a : b));

    	System.out.println("\nType Cast Operator:");

    	byte bt = 1;
    	short sh = -32000;
    	char ch = '\u0002';
    	Long l = 100000000000000000L;
    	float f = 1.9f;
    	double d = 123456789.625;
    	boolean bool = true;

    	c = bt;
    	System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
    	c = sh;
    	System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
    	c = ch;
    	System.out.printf("int = char: c = %c --> c = %d\n", ch, c);
    	c = (int)l;
    	System.out.printf("int = Long: c = (int)%d --> c = %d\n", l, c);
    	c = (int)f;
    	System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
    	c = int(d);
    	System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
    	System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
	}
		public static void testBoolean(){
	    boolean a = true, b = false, c;

	    System.out.println("\n***** Arithmetical Operators *****");

	    System.out.println("\n***** Bitwise Operators *****");

	    c = a & b;
	    System.out.printf("%b & %b = %b\n", a, b, c);
	    c = a | b;
	    System.out.printf("%b | %b = %b\n", a, b, c);
	    c = a ^ b;
	    System.out.printf("%b ^ %b = %b\n", a, b, c);

	    System.out.println("\n***** Assignment Operators *****");

	    System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
	    System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
	    System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
	    
	    System.out.println("\n***** Relational Operators *****");

	    System.out.printf("%b == %b --> %b\n", a, b, a == b);
	    System.out.printf("%b != %b --> %b\n", a, b, a != b);

	    System.out.println("\n***** Logical Operations *****");

	    c = a && b;
	    System.out.printf("%b && %b = %b\n", a, b, c);
	    c = a || b;
	    System.out.printf("%b || %b = %b\n", a, b, c);
	    c = a ^ b;
	    System.out.printf("%b ^ %b = %b\n", a, b, c);
	    System.out.printf("!%b --> %b\n", a, !a);

	    System.our.println("\n***** Misc Operators *****");

	    System.out.println("\nCondition Operator:");

	    System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));

	    System.out.println("\nType Cast Operator:");

	    boolean bool = true;
	    c = bool;
	    System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
	}
	public static void testByte(){ 
		byte a = 50, b = 40, c; 
		System.out.println("*****Arithmetical Operators*****");
		//addition 
		c = (byte)(a + b); 
		System.out.printf("%d + %d = %d\n", a, b, c); 
		//subtraction c = (byte)(a - b); 
		System.out.printf("%d - %d = %d\n", a, b, c); 
		//multiplication 
		c = (byte)(a * b); 
		System.out.printf("%d * %d = %d\n", a, b, c); 
		//division 
		c = (byte)(a / b); 
		System.out.printf("%d / %d = %d\n", a, b, c); 
		//modulus 
		c = (byte)(a % b); 
		System.out.printf("%d %% %d = %d\n", a, b, c); 
		a = 50;
		//unary minus 
		c = (byte)-a; 
		System.out.printf("-%d = %d\n", a, c); 
		//unary plus 
		c = (byte)+a; 
		System.out.printf("+%d = %d\n", a, c); 
		//prefix increment 
		a = 50; 
		System.out.printf("++%d = %d\n", a, ++a); 
		//postfix increment 
		a = 50; 
		System.out.printf("%d++ = %d\n", a, a++); 
		//prefix decrement 
		a = 50; 
		System.out.printf("--%d = %d\n", a, --a); 
		//unary minus a = 50; 
		System.out.printf("%d-- = %d\n", a, a--); 

		System.out.println("***** Bitwise Operators *****"); 

		c = (byte)(a & b); 
		//bitwise AND 
		System.out.printf(" %d & %d = %d\n", a, b, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c));

		System.out.printf(" %d ^ %d = %d\n", a, b, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s ^ %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c)); 
		c = (byte)~a; 
		//bitwise unary compliment 
		System.out.printf(" ~%d = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); c = (byte)(a << 1); 
		//Left Shift 
		System.out.printf(" %d << 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		c = (byte)(a >> 1); 
		//right shift 
		System.out.printf(" %d >> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));
		a = -50;
		c = (byte)(a >> 1); 
		//right shift 
		System.out.printf(" %d >> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		a = 50; 
		c = (byte)(a >>> 1); 
		// zero fill right shift 
		System.out.printf("%d >>> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		a = -50; 
		c = (byte)(a >>> 1); 
		// zero fill right shift 
		System.out.printf("%d >>> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 

		System.out.println("\n***** Assignment Operators *****")

		c = 70; 
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 

		System.out.println("\n***** Relational Operators *****"); 

		// greater than
		System.out.printf("%d > %d --> %b\n", a, b, a > b); 
		// greater than or equal to 
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
		// less than 
		System.out.printf("%d < %d --> %b\n", a, b, a < b);

		// less than or equal to 
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b); 
		// equal to 
		System.out.printf("%d == %d --> %b\n", a, b, a == b); 
		// not equal to 
		System.out.printf("%d != %d --> %b\n", a, b, a != b); 
		System.out.println("\n***** Logical Operations *****"); 
		// logical AND 
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
		// bitwise logical AND 
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
		// logical OR 
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0)); 
		// bitwise logical OR
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0)); 
		// logical XOR 
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
		// logical NOT 
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 

		System.out.println("\n***** Misc Operators *****"); 

		System.out.println("\nCondition Operator:"); 
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 
		System.out.println("\nType Cast Operator:"); 
		byte bt = 1; 
		short sh = -32000; 
		char ch = '\u0002'; 
		long l = 100000000000000000L; 
		float f = 1.9f; 
		double d = 123456789.625; 
		boolean bool = true; 
		c = bt; 
		System.out.printf("byte = short: c = %d --> c = %d\n", sh, c); 
		c = (byte)sh; 
		System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c); 
		c = (byte) ch; 
		System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c); 
		c = (byte) l; 
		System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
		c = (byte) f; 
		System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c); 
		c = (byte) d; 
		System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool); 
	} 
	public static void testShort(){ 
		short a = 32000, b = 20000, c; 

		System.out.println("*****Arithmetical Operators*****"); 

		//addition 
		c = (short)(a + b); 
		System.out.printf("%d + %d = %d\n", a, b, c); 
		//subtraction 
		c = (short)(a - b); 
		System.out.printf("%d - %d = %d\n", a, b, c); 
		//multiplication 
		c = (short)(a * b); 
		System.out.printf("%d * %d = %d\n", a, b, c); 
		//division 
		c = (short)(a / b);
		System.out.printf("%d / %d = %d\n", a, b, c); 
		//modulus 
		c = (short)(a % b); 
		System.out.printf("%d %% %d = %d\n", a, b, c); 
		a = 32000; 
		//unary minus 
		c = (short)-a; 
		System.out.printf("-%d = %d\n", a, c); 
		//unary 
		plus c = (short)+a; 
		System.out.printf("+%d = %d\n", a, c); 
		//prefix increment 
		a = 32000; 
		System.out.printf("++%d = %d\n", a, ++a); 
		//postfix increment 
		a = 32000; 
		System.out.printf("%d++ = %d\n", a, a++); 
		//prefix decrement
		a = 32000; 
		System.out.printf("--%d = %d\n", a, --a); 
		//unary minus 
		a = 32000; 
		System.out.printf("%d-- = %d\n", a, a--); 

		System.out.println("***** Bitwise Operators *****"); 

		c = (short)(a & b); 
		//bitwise AND 
		System.out.printf(" %d & %d = %d\n", a, b, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s & %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c)); 
		c = (short)(a ^ b); 
		//bitwise XOR 
		System.out.printf(" %d ^ %d = %d\n", a, b, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s ^ %s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(b), Integer.toBinaryString(c)); 
		c = (short)~a; 
		//bitwise unary compliment 
		System.out.printf(" ~%d = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" ~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		c = (short)(a << 1); 
		//Left Shift 
		System.out.printf(" %d << 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		c = (short)(a >> 1); 
		//right shift 
		System.out.printf(" %d >> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		a = -32000; 
		c = (short)(a >> 1); 
		//right shift 
		System.out.printf(" %d >> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf(" %s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		a = 32000; 
		c = (short)(a >>> 1); 
		// zero fill right shift 
		System.out.printf("%d >>> 1 = %d\n", a, c);
		System.out.println("in binary form:");
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		a = -32000; 
		c = (short)(a >>> 1); 
		// zero fill right shift 
		System.out.printf("%d >>> 1 = %d\n", a, c); 
		System.out.println("in binary form:"); 
		System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c)); 
		System.out.println("\n***** Assignment Operators *****"); 
		c = 31000; 
		System.out.printf("%d += %d --> c = %d\n", c, a, c += a); 
		System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a); 
		System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a); 
		System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a); 
		System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a); 
		System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a); 
		System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a); 
		System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a); 
		System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1); 
		System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1); 
		System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1); 

		System.out.println("\n***** Relational Operators *****"); 
		// greater than 
		System.out.printf("%d > %d --> %b\n", a, b, a > b); 
		// greater than or equal to 
		System.out.printf("%d >= %d --> %b\n", a, b, a >= b); 
		// less than 
		System.out.printf("%d < %d --> %b\n", a, b, a < b); 
		// less than or equal to 
		System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
		// equal to 
		System.out.printf("%d == %d --> %b\n", a, b, a == b); 
		// not equal to 
		System.out.printf("%d != %d --> %b\n", a, b, a != b); 

		System.out.println("\n***** Logical Operations *****"); 
		// logical AND 
		System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0)); 
		// bitwise logical AND 
		System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0)); 
		// logical OR 
		System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
		// bitwise logical OR 
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0)); 
		// logical XOR 
		System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0)); 
		// logical NOT 
		System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b)); 

		System.out.println("\n***** Misc Operators *****"); 

		System.out.println("\nCondition Operator:"); 
		System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b)); 
		System.out.println("\nType Cast Operator:"); 
		byte bt = 1; 
		short sh = -32000; 
		char ch = '\u0002'; 
		long l = 100000000000000000L;
		float f = 1.9f; 
		double d = 123456789.625; 
		boolean bool = true; 
		c = sh; 
		System.out.printf("short = byte: c = %d --> c = %d\n", bt, c); 
		c = (short)bt; 
		System.out.printf("short = char: c = '%c' --> c = %d\n", ch, c);
		c = (short) ch; 
		System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c); 
		c = (short) l; 
		System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c); 
		c = (short) f; 
		System.out.printf("int = double: c = (short)%f --> c = %d\n", d, c); 
		c = (short) d; 
		System.out.printf("int = boolean: c = (short)%b --> Compile Error\n", bool); 
	}
	public static void testLong(){
        long a = 10000L, b = 20000L, c;
        
        System.out.println("*****Arithmetical Operators*****");
        
        //addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        //subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        //multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        //modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 10000L;
        //unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        //unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        //prefix increment
        a = 10000L;
        System.out.printf("++%d = %d\n", a, ++a);
        //postfix increment
        a = 10000L;
        System.out.printf("%d++ = %d\n", a, a++);
        //prefix decrement
        a = 10000L;
        System.out.printf("--%d = %d\n", a, --a);
        //unary minus
        a = 10000L;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("***** Bitwise Operators *****");
       
        c = a & b; //bitwise AND
        System.out.printf(" %d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf(" %s & %s = %s\n", Long.toBinaryString(a),Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; //bitwise XOR
        System.out.printf(" %d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf(" %s ^ %s = %s\n", Long.toBinaryString(a),Long.toBinaryString(b), Long.toBinaryString(c));


        c = ~a; //bitwise unary compliment
        System.out.printf(" ~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf(" ~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a << 1; //Left Shift
        System.out.printf(" %d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf(" %s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        c = a >> 1; //right shift
        System.out.printf(" %d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf(" %s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = -10000L;
        c = a >> 1; //right shift
        System.out.printf(" %d  >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf(" %s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        a = 10000L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
        a = -10000L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        
        c = 20000L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);


        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        
        System.out.println("\n***** Logical Operations *****");
        
        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
		// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
		// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
		// logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        
        System.out.println("\n***** Misc Operators *****");
        
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;

        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = (long)bt;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = (long)sh;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = (long) ch;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) f;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        c = (long) d;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",
                bool);
    }
}
