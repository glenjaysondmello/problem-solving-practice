public class nthMagicNum {
    public static void main(String args[]) {
        int n = 2;
        int base = 5;
        System.out.println(nthMagicNumber(n, base));
    }
    private static int nthMagicNumber(int n, int base) {
        int ans = 0;
        int last;
        while(n > 0) {
            last = n & 1;
            n >>= 1;
            ans +=  last * base;
            base *= 5;
        }
        return ans;
    }
}
