public class rotationCount {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 0, 1, 2};
        int max = findMax(arr);
        int count = max + 1;
        // int count = findRotationCount(arr, max);
        System.out.println(count);
    }   

    static int findMax(int[] arr) {
        int start = 0, end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end  && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if(mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }

            if(arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // static int findRotationCount(int[] arr, int max) {
    //     if(max == -1) {
    //         return 0;
    //     }

    //     int count = 0;
    //     for(int i = 0; i <= max; i++) {
    //         count++;
    //     }

    //     return count;
    // }
}

