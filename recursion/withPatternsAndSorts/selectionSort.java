import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr1 = { 4, 3, 2, 1 };
        int[] arr2 = { 5, 2, 3, 7, 9, 8 };
        System.out.println(Arrays.toString(sort(arr1, arr1.length - 1)));
        System.out.println(Arrays.toString(sort(arr2, arr2.length - 1)));
        System.out.println(Arrays.toString(sort2(arr1, 0,  arr1.length - 1, 0)));
        System.out.println(Arrays.toString(sort2(arr2, 0,  arr2.length - 1, 0)));
    }

    static int max(int[] arr, int e) {
        int max = 0;

        for(int i = 1; i <= e; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static int[] sort(int[] arr, int e) {
        if(e == 0) {
            return arr;
        }

        int max = max(arr, e);
        arr[max] = arr[max] + arr[e] - (arr[e] = arr[max]);
        return sort(arr, e - 1); 
    }

    static int[] sort2(int[] arr, int s, int e, int max) {
        if (e == 0) {
            return arr;
        }

        if (s <= e) {
            if(arr[s] > arr[max]) {
                return sort2(arr, s + 1, e, s);
            } else {
                return sort2(arr, s + 1, e, max);
            }
        } else {
            arr[max] = arr[max] + arr[e] - (arr[e] = arr[max]);
            return sort2(arr, 0, e - 1, 0);
        }

    }


}
