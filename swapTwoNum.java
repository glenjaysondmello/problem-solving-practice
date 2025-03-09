public class swapTwoNum {
    public static void main(String args[]) {
        int a = 3, b = 2;
        swap(a, b);
    }
    private static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a:"+ a+ "\nb:"+ b);
    }
}
