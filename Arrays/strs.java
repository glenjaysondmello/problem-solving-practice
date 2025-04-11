import java.util.*;

public class strs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        
        for(int i=0; i<str.length; i++) {
            // str[i] =  sc.nextLine();
            str[i] =  sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "some";

        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
