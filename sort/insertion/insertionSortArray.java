import java.util.Arrays;

public class insertionSortArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i ++) {
            for(int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] + arr[j - 1] - (arr[j - 1] = arr[j]);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}