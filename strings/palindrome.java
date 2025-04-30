public class palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome1(str));
    }

    static boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while(s < e) {
            if(str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    static boolean isPalindrome1(String str) {
        if(str == null || str.length() == 0) {
            return true;
        }
        
        for(int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            char e = str.charAt(str.length() - 1 - i);
            if(s != e) {
                return false;
            }
        }
        return true;
    }
}
