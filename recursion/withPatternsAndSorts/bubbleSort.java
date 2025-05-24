import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 7, 9, 8 };
        System.out.println(Arrays.toString(sort(arr, 1, arr.length - 1)));
        System.out.println(Arrays.toString(sort2(arr, 1, arr.length - 1)));
        sort3(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr, int s, int e) {
        if (e == 0) {
            return arr;
        }

        if (s == arr.length) {
            return sort(arr, 1, e - 1);
        }

        if (arr[s - 1] > arr[s]) {
            arr[s] = arr[s - 1] + arr[s] - (arr[s - 1] = arr[s]);
            return sort(arr, s + 1, e);
        } else {
            return sort(arr, s + 1, e);
        }

    }

    static int[] sort2(int[] arr, int s, int e) {
        if (e == 0) {
            return arr;
        }

        if (s < e) {
            if (arr[s - 1] > arr[s]) {
                arr[s] = arr[s - 1] + arr[s] - (arr[s - 1] = arr[s]);
            }
            return sort(arr, s + 1, e);
        } else {
            return sort(arr, 1, e - 1);
        }

    }

    static void sort3(int[] arr, int s, int e) {
        if (e == 0) {
            return;
        }

        if (s < e) {
            if (arr[s - 1] > arr[s]) {
                arr[s] = arr[s - 1] + arr[s] - (arr[s - 1] = arr[s]);
            }
            sort(arr, s + 1, e);
        } else {
            sort(arr, 1, e - 1);
        }

    }

}
