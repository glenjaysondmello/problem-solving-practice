import java.util.Arrays;

public class selectionSortArray {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, -4, 5, 0 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = max_ind(arr, arr.length - i);
            arr[max] = arr[arr.length - i - 1] + arr[max] - (arr[arr.length - i - 1] = arr[max]);
        }
        return arr;
    }

    static int max_ind(int[] arr, int n) {
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}