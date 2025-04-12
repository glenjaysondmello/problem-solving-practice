import java.util.*;

public class arrays_2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("------------------------------------");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


        System.out.println("------------------------------------");

        for(int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("------------------------------------");


        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");


        sc.close();
    }
}
