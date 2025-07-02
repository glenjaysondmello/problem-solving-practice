public class rightMostBit {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(rightMostBitFunc(num));
    }
    private static int rightMostBitFunc(int num) {
        // return (int) (Math.log(num & -num) / Math.log(2) + 1);

        if(num == 0) return 0;

        int pos = 1;
        while((num & 1) == 0) {
            num >>= 1;
            pos++;
        }
        return pos;
    }
}
