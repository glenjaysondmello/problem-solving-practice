import java.util.ArrayList;

public class iterativeDuplicate {
    public static void main(String[] args) {
           int[] arr = {1, 2, 2};
           System.out.println(iter(arr));
    }

    static ArrayList<ArrayList<Integer>> iter(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0, end = 0;

        for(int j = 0; j < arr.length; j++) {
            start = 0;

            if(j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }

            end = outer.size() - 1;
            
            int n = outer.size();
            for(int i = start; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
