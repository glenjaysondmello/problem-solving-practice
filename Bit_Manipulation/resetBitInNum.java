public class resetBitInNum {
    public static void main(String args[]) {
        int num = 5;
        int i = 2;
        System.out.println(resetBit(num, i));
    }
    private static int resetBit(int num, int i) {
        return num & ~(1 << i);
    }
}
