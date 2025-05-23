public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
        System.out.println(prod(1342));
    }

    static int sum(int n) {
        if(n == 0) {
            return n;
        }

        return sum(n / 10) + (n % 10);
    }

    static int prod(int n) {
        if(n%10 == n) {
            return n;
        }

        return prod(n / 10) * (n % 10);
    }
}
