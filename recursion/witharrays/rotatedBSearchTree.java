public class rotatedBSearchTree {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 9;
        int start = 0, end = arr.length - 1;
        System.out.println(bSearch(arr, target, start, end));
    }

    static int bSearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(target == arr[mid]) {
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return bSearch(arr, target, start, mid - 1);
            } else {
                return bSearch(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]) {
            return bSearch(arr, target, mid + 1, end);
        } else {
            return bSearch(arr, target, start, mid - 1);
        }
    }
}
