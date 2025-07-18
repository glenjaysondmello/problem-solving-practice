import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(int num) {
        BigInteger b = new BigInteger("1");

        for(int i = 2; i <= num; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        return b;
    }
}
