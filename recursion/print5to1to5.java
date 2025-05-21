public class print5to1to5 {
    public static void main(String args[]) {
        printBoth1(1);
        printBoth2(5);
    }
    static void printBoth1(int n) {
        if(n == 6) {
            return;
        }

        System.out.println(n);
        printBoth1(n + 1);
        System.out.println(n);
    }

    static void printBoth2(int n) {
        if(n == 0) {
            return;
        }

        System.out.println(n);
        printBoth2(n - 1);
        System.out.println(n);
        
    }
}
