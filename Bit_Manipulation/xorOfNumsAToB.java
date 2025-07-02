public class xorOfNumsAToB {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int xorAtoB = xor(b) ^ xor(a - 1);
        System.out.println(xorAtoB);
        
        // int ans = 0;

        // for(int i = a; i <= b; i++) {
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
