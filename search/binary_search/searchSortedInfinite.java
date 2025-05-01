public class searchSortedInfinite {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 12, 14, 15, 17, 18, 20, 25, 34, 39, 48, 49, 50, 52, 60, 66, 69};
        int target = 17;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = 1;
        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
