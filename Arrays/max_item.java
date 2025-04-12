public class max_item {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 34, 12};
        System.out.println(maxItem(arr));
    }
    static int maxItem(int[] arr) {
        // int max = arr[0];
        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
