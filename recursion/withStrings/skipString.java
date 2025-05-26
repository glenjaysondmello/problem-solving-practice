public class skipString {
    public static void main(String[] args) {
        String str1 = "bcapped";
        String str2 = "bcappleed";
        System.out.println(skipApple(str2));
        System.out.println(skipAppNotApple(str1));
        System.out.println(skipAppNotApple(str2));
    }

    static String skipApple(String str) {
        if(str.isEmpty()) {
            return "";
        }

        String skipS = "apple";
        char ch = str.charAt(0);

        boolean s = str.startsWith(skipS);
        int lenS = skipS.length();

        if(s) {
            return skipApple(str.substring(lenS));
        } else {
            return ch + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str) {
        if(str.isEmpty()) {
            return "";
        }

        String skipS = "app";
        String notS = "apple";
        char ch = str.charAt(0);

        boolean s = str.startsWith(skipS);
        boolean n = str.startsWith(notS);

        int lenS = skipS.length();

        if(s && !n) {
            return skipAppNotApple(str.substring(lenS));
        } else {
            return ch + skipAppNotApple(str.substring(1));
        }
    }
}
