public class sqrtBinarySearch {
    public static void main(String[] args) {
        int n = 50;
        int p = 3;
        System.out.printf("%.3f", sqrt(n, p));
        System.out.println();
    }

    static double sqrt(int n, int p) {
        int s = 0, e = n;
        double root = 0.0;

        while(s <= e) {
            int m = ( s + e ) / 2;

            if(m * m == n) {
                return m;
            } else if(m * m > n) {
                e = m - 1;
            } else {
                root = m;
                s = m + 1;
            }
        }

        double inc = 0.1;
        for(int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }

        return root;
    }
}
