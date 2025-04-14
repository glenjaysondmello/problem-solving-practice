import java.util.Arrays;

public class searchString {
    public static void main(String[] args) {
        String str = "dmello";
        char target = 'e';
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }

        // for(char ch : str.toCharArray()) {
        //     if(ch == target) {
        //         return true;
        //     }
        // }

        return false;
    }
}