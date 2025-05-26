import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        // subset(str, "");
        // ArrayList<String> arr = new ArrayList<>();
        // subsetArr(str, "", arr);
        // System.out.println(arr);
        System.out.println(subsetR(str, ""));
        // System.out.println(subsetRF(str, "", arr));
    }

    static void subset(String str, String pro) {
        if(str.isEmpty()) {
            System.out.println(pro);
            return;
        }

        char ch = str.charAt(0);

        subset(str.substring(1), pro + ch);
        subset(str.substring(1), pro);
    }

    static void subsetArr(String str, String pro, ArrayList<String> arr) {
        if(str.isEmpty()) {
            arr.add(pro);
            return;
        }

        char ch = str.charAt(0);

        subsetArr(str.substring(1), pro + ch, arr);
        subsetArr(str.substring(1), pro, arr);
    }

    static ArrayList<String> subsetR(String str, String pro) {
        if(str.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subsetR(str.substring(1), pro + ch);
        ArrayList<String> right = subsetR(str.substring(1), pro);

        left.addAll(right);

        return left;
    }

    // static ArrayList<String> subsetRF(String str, String pro, ArrayList<String> arr) {
    //     if(str.isEmpty()) {
    //         arr.add(pro);
    //         return arr;
    //     }

    //     char ch = str.charAt(0);

    //     ArrayList<String> left = subsetRF(str.substring(1), pro + ch, arr);
    //     ArrayList<String> right = subsetRF(str.substring(1), pro, arr);

    //     left.addAll(right);

    //     return left;
    // }
}
