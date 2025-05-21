public class sum {
    public static void main(String[] args) {
        System.out.println(s(5));
    }

    static int s(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return n + s(n - 1);
    }
}
