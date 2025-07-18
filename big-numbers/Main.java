import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("3713612381731239");
        BigInteger b2 = new BigInteger("7387928012381731");

        BigInteger b3 = BigInteger.valueOf(5678);

        System.out.println(b1);
        System.out.println(b3);

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.remainder(b2));

        if(b3.compareTo(b1) < 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if(b2.compareTo(b1) < 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // System.out.println(Factorial.fact(123456));
        System.out.println(Factorial.fact(100));

        double u = 0.3;
        double v = 0.4;

        System.out.println(v - u);

        BigDecimal x = new BigDecimal("0.3");
        BigDecimal y = new BigDecimal("0.4");

        System.out.println(y.subtract(x));

        BigInteger c1 = BigInteger.ONE;
        BigDecimal c2 = BigDecimal.TEN;

        System.out.println(c1);
        System.out.println(c2);

        BigDecimal n = c2.negate();

        System.out.println(n);

        BigDecimal p = c2.pow(2);

        System.out.println(p);

    }
}