public class setBitsOfNumber {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    private static int setBits(int n) {
        int count = 0;
        while(n > 0) {
            n &= (n-1);
            // n -= (n & -n);
            count++;
        }
        // while(n > 0) {
        //     if((n & 1) == 1) {
        //         count++;
        //     }
        //     n >>= 1;
        // }
        
        return count;
    }
}
