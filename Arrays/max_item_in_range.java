public class max_item_in_range {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 34, 12};
        System.out.println(maxItem(arr, 1, 3));
    }
    static int maxItem(int[] arr, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        if(end >= start) {
            return -1;
        }
        int max = arr[start];
        for(int i = start + 1; i <= end; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
