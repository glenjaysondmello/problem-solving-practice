public class reverseNumber {
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }

    static int sum = 0;

    static int reverse(int n) {
        if(n == 0) {
            return 0;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;

        return reverse(n/10);
    }
}
