import java.util.ArrayList;

public class iterativeS {
    public static void main(String[] args) {
           int[] arr = {1, 2, 3};
           System.out.println(iter(arr));
    }

    static ArrayList<ArrayList<Integer>> iter(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr) {
            int n = outer.size();
            for(int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
