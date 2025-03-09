public class setBitInNum {
    public static void main(String args[]) {
        int num = 5;
        int i = 1;
        System.out.println(setBit(num, i));
    }
    private static int setBit(int num, int i) {
        return num | (1 << i);
    }
}
