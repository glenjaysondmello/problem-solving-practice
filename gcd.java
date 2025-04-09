public class gcd {
    public static void main(String[] args) {
        int a = 24, b = 36;
        System.out.println(gcd_(a, b));
    }

    static int gcd_(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd_(b % a, a);
    }
}
