import java.util.ArrayList;

class Dice {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(comb(num, ""));
    }

    static ArrayList<String> comb(int num, String pro) {
        if(num == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        ArrayList<String> array = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= num; i++) {
            int n1 = num - i;

            array.addAll(comb(n1, pro + i));
        }

        return array;
    }
}
