public class skipChar {
    public static void main(String[] args) {
        String str = "baccad";
        // String ans = "";
        // System.out.println(stringF2(str, ans));
        // stringF1(str, ans);
        System.out.println(stringF3(str));

    }

    static void stringF1(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            stringF1(str.substring(1), ans);
        } else {    
            stringF1(str.substring(1), ans + ch);
        }
    }

    static String stringF2(String str, String ans) {
        if(str.isEmpty()) {
            return ans;
        }

        char ch = str.charAt(0);
        if(ch == 'a') {
            return stringF2(str.substring(1), ans);
        } else {
            return stringF2(str.substring(1), ans + ch);
        }
    }

    static String stringF3(String str) {
        if(str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a') {
            return stringF3(str.substring(1));
        } else {
            return ch + stringF3(str.substring(1));
        }
    }
}