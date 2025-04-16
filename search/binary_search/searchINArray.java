public class searchINArray {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 45, 67, 89, 340, 670, 720};
        int target = 670;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid] ) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}