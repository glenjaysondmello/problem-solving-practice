public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i = 0; i < 2 * n; i++) {
            int columnRow = i > n ? 2 * n - i: i; 

            for(int j = 0; j < columnRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
