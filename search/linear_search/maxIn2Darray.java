// public class maxIn2Darray {
//     public static void main(String[] args) {
//         int[][] nums = { { 34, 56, -5, 78 }, { 11, 45, -23, 67, 90 }, {4, 7, -1} };
//         int target = 7;
//         System.out.println(max(nums, target));

//     }

//     static int max(int[][] arr, int target) {
//         if (arr.length == 0) {
//             return Integer.MAX_VALUE;
//         }

//         int max = arr[0][0]; 

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }

//         return max;
//     }

// }
