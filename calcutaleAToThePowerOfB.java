public class calcutaleAToThePowerOfB {
    public static void main(String[] args) {
        int base = 5;
        int power = 4;
        System.out.println(aPowerb(base, power));
    }
    private static int aPowerb(int base, int power) {
        int ans = 1;
        while(power > 0) {
            if((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        return ans;
        
    }
}
