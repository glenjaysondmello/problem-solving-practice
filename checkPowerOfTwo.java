public class checkPowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }
    private static boolean powerOfTwo(int n) {
        if(n == 0) return false;

        return (n & (n-1)) == 0;
        
        // int count = 0;
        // while(n > 0) {
        //     if((n & 1) == 1) {
        //         count++;
        //     }
        //     n >>= 1;
        // }
        // return count == 1;
    }
}
