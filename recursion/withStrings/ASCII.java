public class ASCII {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "");
    }

    static void subset(String str, String pro) {
        if(str.isEmpty()) {
            System.out.println(pro);
            return;
        }

        char ch = str.charAt(0);

        subset(str.substring(1), pro + ch);
        subset(str.substring(1), pro);
        subset(str.substring(1), pro + (ch + 0));
    }
}
