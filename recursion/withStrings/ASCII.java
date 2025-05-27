import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        String str = "abc";
        // subset(str, "");
        ArrayList<String> arr = subsetA(str, "");
        System.out.println(arr);
        // int count = subsetC(str, "");
        // System.out.println(count);

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

    static ArrayList<String> subsetA(String str, String pro) {
        if(str.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subsetA(str.substring(1), pro + ch);
        ArrayList<String> right = subsetA(str.substring(1), pro);

        left.addAll(right);

        ArrayList<String> ascii = subsetA(str.substring(1), pro + (ch + 0));

        left.addAll(ascii);

        return left;
    }

    static int subsetC(String str, String pro) {
        if(str.isEmpty()) {
            return 1;
        }

        char ch = str.charAt(0);

        int count = 0;

        count += subsetC(str.substring(1), pro + ch);
        count += subsetC(str.substring(1), pro);
        count += subsetC(str.substring(1), pro + (ch + 0));

        return count;
    }
}
