import java.util.ArrayList;

public class permutation1 {
    public static void main(String[] args) {
        String str = "abc";
        // perm(str, "");
        ArrayList<String> permA = permA(str, "");
        System.out.println(permA);
        // int permC = permC(str, "");
        // System.out.println(permC);
        // int count = 0;
        // int permCA = permCA(str, "", count);
        // System.out.println(permCA);
    }

    static void perm(String str, String pro) {
        if(str.isEmpty()) {
            System.out.println(pro);
            return;
        }

        char ch = str.charAt(0);

        for(int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i, pro.length());
            perm(str.substring(1), first + ch + second);
        }
    }

    static ArrayList<String> permA(String str, String pro) {
        if(str.isEmpty()) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(pro);
            return arr;
        }

        char ch = str.charAt(0);

        ArrayList<String> pArr = new ArrayList<>();

        for(int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i, pro.length());
            pArr.addAll(permA(str.substring(1), first + ch + second));
        }

        return pArr;
    }

    static int permC(String str, String pro) {
        if(str.isEmpty()) {
            return 1;
        }

        char ch = str.charAt(0);

        int count = 0;

        for(int i = 0; i <= pro.length(); i++) {
            String first = pro.substring(0, i);
            String second = pro.substring(i, pro.length());
            count += permC(str.substring(1), first + ch + second);
        }

        return count;
    }

    // static int permCA(String str, String pro, int count) {
    //     if(str.isEmpty()) {
    //         return count + 1;
    //     }

    //     char ch = str.charAt(0);

    //     int countN = 0;

    //     for(int i = 0; i <= pro.length(); i++) {
    //         String first = pro.substring(0, i);
    //         String second = pro.substring(i, pro.length());
    //         countN += permCA(str.substring(1), first + ch + second, count);
    //     }

    //     return countN;
    // }


}