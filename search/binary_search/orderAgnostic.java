public class orderAgnostic {
    public static void main(String[] args) {
        // int[] arr = { -3, -1, 45, 67, 89, 340, 670, 720 };
        int[] arr = { 39, 21, 11, 5, 3, 3, -9, -720 };
        int target = -9;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        boolean isAse = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAse) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
