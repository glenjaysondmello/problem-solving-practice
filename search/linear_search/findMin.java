public class findMin {
    public static void main(String[] args) {
        int[] nums = {34, -5, 89, 23, 4, -1};
        System.out.println(find_min(nums));
    }

    static int find_min(int[] arr) {
        int min = arr[0];

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }

        return min;
    }
}
