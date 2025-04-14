import java.util.Arrays;

public class searchIndex2D {
    public static void main(String[] args) {
        int[][] nums = { { 34, 56, -5, 78 }, { 11, 45, -23, 67, 90 }, {4, 7, -1} };
        int target = 7;
        System.out.println(Arrays.toString(search(nums, target)));

    }

    static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
