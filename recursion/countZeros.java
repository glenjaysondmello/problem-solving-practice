public class countZeros {
    public static void main(String[] args) {
        System.out.println(count(10300, 0));
        // System.out.println(count2(10300));
    }

    static int count(int n, int count) {
        int rem = n % 10;
        if(n % 10 == n) {
            return count;
        }
        if(rem == 0) {
            return count((n / 10), ++count);
        } else {
            return count((n/10), count);
        }
    }

    //with helper

    static int count2(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count){
        int rem = n % 10;
        if(n % 10 == n) {
            return count;
        }
        if(rem == 0) {
            return count((n / 10), ++count);
        } else {
            return count((n/10), count);
        }
    }
}
