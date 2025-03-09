public class oddOrEven {
    public static void main(String args[]) {
        int num = 49;
        if(isOdd(num)) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}