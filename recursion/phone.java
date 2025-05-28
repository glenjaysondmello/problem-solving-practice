import java.util.ArrayList;

class Phone {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(comb(digits, ""));
    }

    static ArrayList<String> comb(String digits, String pro) {
        if(digits.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        ArrayList<String> array = new ArrayList<>();

        int digit = digits.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            array.addAll(comb(digits.substring(1), pro + ch));
        }

        return array;
    }
}
