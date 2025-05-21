public class palindrome2 {
    public static void main(String[] args) {
        int n = 12121;
        System.out.println(palin(n));
    }

    static boolean palin(int n) {
        String str = Integer.toString(n);
        int start = 0, end = str.length() - 1;

        return helper(str, start, end);
    }

    static boolean helper(String str, int start, int end) {
        if(start >= end) {
            return true;
        }

        if(str.charAt(start) == str.charAt(end)) {
            return helper(str, start + 1, end - 1);
        } else {
            return false;
        }
    }  
}
