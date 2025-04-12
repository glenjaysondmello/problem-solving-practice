import java.util.Arrays;

public class reverse_an_array {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 67, 48, 34};
        int[] arr2 = {23, 45, 67, 48, 34, 1};
        reverse(arr1);
        reverse(arr2);
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr2)); 
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        return arr;
    }

    static void swap(int[] arr, int i1, int i2) {
        arr[i1] = arr[i1] ^ arr[i2];
        arr[i2] = arr[i1] ^ arr[i2];
        arr[i1] = arr[i1] ^ arr[i2];
    }
}
