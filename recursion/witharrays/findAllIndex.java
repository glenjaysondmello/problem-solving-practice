import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int[] arr = {2, 5, 2, 7, 2};
        int target = 2;
        System.out.println(find(arr, target, 0));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        // ArrayList<Integer> returnedList = find(arr, target, index + 1);
        // list.addAll(returnedList);
        
        list.addAll(find(arr, target, index + 1));

        return list;
    }
}
