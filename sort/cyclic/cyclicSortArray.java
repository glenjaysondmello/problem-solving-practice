import java.util.Arrays;

public class cyclicSortArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int currentInd = arr[i] - 1;
            if(arr[i] != arr[currentInd]) {
                arr[i] = arr[i] + arr[currentInd] - (arr[currentInd] = arr[i]);
            } else{
                i++;
            }
        }
        return arr;
    }
}