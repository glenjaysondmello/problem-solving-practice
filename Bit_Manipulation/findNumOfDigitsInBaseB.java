public class findNumOfDigitsInBaseB {
    public static void main(String[] args) {
        int num = 10;
        int base = 2; // for binary
        // int base = 10; // for decimal
        System.out.println(numOfDigits(num, base)); 
    }
    private static int numOfDigits(int n, int b) {
        return (int) (Math.log(n) / Math.log(b)) + 1;
    }
}
