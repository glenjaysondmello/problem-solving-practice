public class searchInRange {
    public static void main(String[] args) {
        int start = 1, end = 4;

        int[] nums = {34, -5, 89, 23, 4, -1};
        int target2 = -5;

        String str = "dmello";
        char target1 = 'o';
        
        System.out.println(search1(str, target1, start, end));
        System.out.println(search2(nums, target2, start, end));
    }

    static boolean search1(String str, char target, int start, int end) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = start; i <= end; i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    static boolean search2(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return false;
        }

        for(int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}
