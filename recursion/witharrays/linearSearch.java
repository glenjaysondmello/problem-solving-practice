import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 5};
        int target = 5;
        ArrayList<Integer> list1 = new ArrayList<>();
        // System.out.println(findAllIndexes(arr, target, 0, new ArrayList<>()));

        System.out.println(findAllIndexes(arr, target, 0, list1));
        // System.out.println(search(arr, target, 0));
        // findAllIndex(arr, target, 0);
        // System.out.println(list);
        // System.out.println(searchFromLast(arr, target, arr.length - 1));
        // System.out.println(present(arr, target, 0));
    }

    static int search(int[] arr, int target, int i) {
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == target) {
            return i;
        }

        return search(arr, target, i + 1);
    }

    static int searchFromLast(int[] arr, int target, int i) {
        if(i == -1) {
            return -1;
        }

        if(arr[i] == target) {
            return i;
        }

        return search(arr, target, i - 1);
    }

    static boolean present(int[] arr, int target, int i) {
        if(i == arr.length) {
            return false;
        }

        return (arr[i] == target) || present(arr, target, i + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int i) {
        if(i == arr.length) {
            return;
        }

        if(arr[i] == target) {
            list.add(i);
        }

        findAllIndex(arr, target, i + 1);
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i == arr.length) {
            return list;
        }

        if(arr[i] == target) {
            list.add(i);
        }

        return findAllIndexes(arr, target, i + 1, list);
    }
}
