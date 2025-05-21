public class palindrome {
    public static void main(String[] args) {
        int n = 1221;
        if(p(n)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }

    static boolean p(int n) {
        if(n == reverse(n)) {
            return true;
        } else {
            return false;
        }
    }

    static int reverse(int n) {
        // int digits = (int)(Math.log10(n)) + 1;
        int n1 = n;
        int count = 0;
        while(n1 != 0) {
            n1 /= 10;
            count++;
        }
        int digits = count;
        return helper(n , digits);
    }

    static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }

        int rem = n % 10;

        return (int)(rem * Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
