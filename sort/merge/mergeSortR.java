import java.util.Arrays;

public class mergeSortR {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 4, 1 };
        int[] sortArr = mergeSort(arr);
        System.out.println(Arrays.toString(sortArr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] sortArr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                sortArr[k] = left[i];
                i++;
            } else {
                sortArr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            sortArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            sortArr[k] = right[j];
            j++;
            k++;
        }

        return sortArr;
    }
}