import java.util.Arrays;

public class bubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, 0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    arr[j] = arr[j] + arr[j - 1] - (arr[j - 1] = arr[j]);
                    isSwapped = true;
                }
            }

            if(!isSwapped) {
                break;
            }
        }
        return arr;
    }
}