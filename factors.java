import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 40;
        factors_n(n);
    }

    static void factors_n(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.err.println(i + " ");
                    arr.add(n / i);
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i) + " ");
        }
    }
}
