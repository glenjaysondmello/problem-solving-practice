public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 12, 34, 48, 66, 69};
        int target = 48;
        int start = 0, end = arr.length;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return search(arr, target, s, mid - 1);
        } else {
            return search(arr, target, mid + 1, e);
        }
    }
}
