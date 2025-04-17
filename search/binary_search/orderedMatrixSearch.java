import java.util.Arrays;

public class orderedMatrixSearch {
    public static void main(String args[]) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 },
        };
        int target = 140;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length, cols = arr[0].length;
        if (rows == 0 || cols == 0) {
            return new int[] { -1, -1 };
        }

        if (rows == 1) {
            return b_search(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0, rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }

            if (target > arr[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (arr[rStart][cMid] == target)
            return new int[] { rStart, cMid };
        if (arr[rStart + 1][cMid] == target)
            return new int[] { rStart + 1, cMid };

        if (arr[rStart][cMid - 1] >= target)
            return b_search(arr, rStart, 0, cMid - 1, target);

        if (arr[rStart][cMid + 1] <= target && arr[rStart][cols - 1] >= target)
            return b_search(arr, rStart, cMid + 1, cols - 1, target);

        if (arr[rStart + 1][cMid - 1] >= target)
            return b_search(arr, rStart + 1, 0, cMid - 1, target);

        else
            return b_search(arr, rStart + 1, cMid + 1, cols - 1, target);
    }

    static int[] b_search(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }

            if (target > arr[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
