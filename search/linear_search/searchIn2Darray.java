public class searchIn2Darray {
    public static void main(String[] args) {
        int[][] nums = { { 34, 56, -5, 78 }, { 11, 45, -23, 67, 90 } };
        // int[][] nums = { {}, {2, 3} };
        int target = 1;
        System.out.println(search(nums, target));

    }

    static boolean search(int[][] arr, int target) {
        int k = 0;

        if (arr.length == 0) {
            return false;
        }
        
        // To ignore empty array inside 2d array
        for(int s = 0; s < arr.length; s++) {
            if(arr[s].length == 1) {
                k++;
            }
        }

        for (int i = k; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

}
