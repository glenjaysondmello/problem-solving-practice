import java.util.Arrays;

public class mergeSortInplace {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] sortArr = new int[end - start];
        int i = start, j = mid, k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                sortArr[k] = arr[i];
                i++;
            } else {
                sortArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            sortArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            sortArr[k] = arr[j];
            j++;
            k++;
        }

        for(int c = 0; c < sortArr.length; c++) {
            arr[start + c] = sortArr[c];
        }
    }
}