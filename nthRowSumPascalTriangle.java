public class nthRowSumPascalTriangle {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(nthRowSum(n));
    }
    private static long nthRowSum(int n) {
        return 1 << (n-1);
        // return (long) Math.pow(2, n - 1);
    }
}
