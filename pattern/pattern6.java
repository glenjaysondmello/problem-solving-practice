public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    static void pattern(int n) {
        for(int i = 0; i < 2 * n; i++) {
            int columnNum = i > n ? 2 * n - i : i;
            int spaceNum = n - columnNum;

            for(int s = 0; s < spaceNum; s++) {
                System.out.print(" ");
            }

            for(int j = 0; j < columnNum; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}



// Pattern:

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 