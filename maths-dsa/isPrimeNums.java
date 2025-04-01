class isPrimeNums {
    public static void main(String[] args) {
        int n = 15;
        for(int i=1; i<=n; i++) {
            System.out.println(i + " " + isPrime(i));
            // if(isPrime(i)) {
                // System.out.println(i);
            // }
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        // int c = 2;
        // while(c * c <= n) {
        //     if(n % c == 0) {
        //         return false;
        //     }
        //     c++;
        // }
        for(int c=2; c * c <= n; c++) {
            if(n % c == 0) {
                return false;
            }
        }
        return true;
    }
}