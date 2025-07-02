public class xorOfNums0ToA {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(xor(n));

        // int ans = 0;

        // for(int i = 0; i <= n; i++) {
        //     ans ^= i;
        // }
        // System.out.println(ans);
    }
    private static int xor(int n) {
        if((n % 4) == 0) {
            return n;
        }

        if((n % 4) == 1) {
            return 1;
        }

        if((n % 4) == 2) {
            return n + 1;
        }
        
        return 0;
    }
}