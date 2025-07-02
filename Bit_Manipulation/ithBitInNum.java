public class ithBitInNum {
    public static void main(String args[]) {
        int num = 5;
        int i = 2;
        System.out.println(ithBit(num, i));
    }
    private static int ithBit(int num, int i) {
        // return (num >> i) & 1;
        // return (num & (1 << i)) != 0 ? 1 : 0; // 0-based indexing
        return (num & (1 << (i-1))) != 0 ? 1 : 0; // 1-based indexing
    }
}
