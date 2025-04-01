public class findPrimeNums {
    public static void main(String[] args) {
        int n = 36;
        boolean[] primes = new boolean[n + 1];
        primes(n, primes);
    }

    static void primes(int n, boolean[] primes) {
        for(int i=2; i * i <= n; i++) {
            if(!primes[i]) {
                for(int j=i * 2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<= n; i++) {
            if(!primes[i]) {
                System.out.println(i);
            }
        }
    }
}
