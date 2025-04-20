public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target)  {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return end;
    }
}
