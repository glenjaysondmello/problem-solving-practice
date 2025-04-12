import java.util.Arrays;

public class swap_array_2Elements {
    public static void main(String[] args) {
        int[] arr = {23, 4, 67, 48, 34, 1};
        swap(arr, 3, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i1, int i2) {
        arr[i1] = arr[i1] ^ arr[i2];
        arr[i2] = arr[i1] ^ arr[i2];
        arr[i1] = arr[i1] ^ arr[i2];
    }
}
