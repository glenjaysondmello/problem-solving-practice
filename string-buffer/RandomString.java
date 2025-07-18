import java.util.Random;

public class RandomString {
    static String generate(int size) {
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();

        for(int i = 0; i < size; i++) {
            int randomChar = 97 + (int) (rand.nextFloat() * 26);
            sb.append((char) randomChar);
        }

        return sb.toString();
    }
}
